class Pact {
    constructor(executor) {
        this.values = [];
        this.thenCallbacks = [];
        this.catchCallbacks = [];
        this.resolved = false;


        const resolve = (value) => {
            if(!this.resolved){
                this.values.push(value);
                this.executeCallbacks(this.thenCallbacks, value);
                this.resolved = true;
            }
        };

        const reject = (reason) => {
            if(!this.resolved){
                this.values.push(reason);
                this.executeCallbacks(this.catchCallbacks, reason);
                this.resolved = true;
            }
        };

        executor(resolve, reject);
    }

    then(callback) {
        this.thenCallbacks.push(callback);
        if (this.resolved) {
            // If already resolved, immediately call the callback with the resolved value
            this.executeCallbacks(this.thenCallbacks, this.values[0]);
        }
        return this; // Allow method chaining
    }

    catch(callback) {
        this.catchCallbacks.push(callback);
        if (this.resolved) {
            // If already resolved, immediately call the callback with the resolved value
            this.executeCallbacks(this.catchCallbacks, this.values[0]);
        }
        return this; // Allow method chaining
    }

    executeCallbacks(callbacks, value) {
        for (const callback of callbacks) {
            callback(value);
        }
    }
}

module.exports = Pact;
