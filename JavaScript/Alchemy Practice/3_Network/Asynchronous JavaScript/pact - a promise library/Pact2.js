class Pact {
    constructor(executor){
        this.value = null;
        this.thenCallback = null;
        this.catchCallback = null;

        const resolve = (value) => {
            this.value = value;
            if (this.thenCallback) {
                this.thenCallback(value);
            }
        };

        const reject = (reason) => {
            if (this.catchCallback) {
                this.catchCallback(reason);
            }
        };

        executor(resolve,reject);
    }
    // add methods to return on the instance
    catch(callback){
        this.catchCallback = callback;
        return this;
    }
    then(callback) {
        this.thenCallback = callback;
        return this; // Allow method chaining
    }

}

module.exports = Pact;