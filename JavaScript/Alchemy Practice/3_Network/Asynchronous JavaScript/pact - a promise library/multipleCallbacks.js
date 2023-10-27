class Pact {
    constructor(executor) {
        this.values = [];
        this.thenCallbacks = [];
        this.catchCallbacks = [];

        const resolve = (value) => {
            this.values.push(value);
            this.executeCallbacks(this.thenCallbacks, value);
        };

        const reject = (reason) => {
            this.values.push(reason);
            this.executeCallbacks(this.catchCallbacks, reason);
        };

        executor(resolve, reject);
    }

    then(callback) {
        this.thenCallbacks.push(callback);
        return this;
    }

    catch(callback) {
        this.catchCallbacks.push(callback);
        return this;
    }

    executeCallbacks(callbacks, value) {
        for (const callback of callbacks) {
            callback(value);
        }
    }
}

module.exports = Pact;
