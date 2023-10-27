class Pact {
    constructor(executor){
        this.value = null;
        this.thenCallback = null;

        const resolve = (value) => {
            this.value = value;
            if (this.thenCallback) {
                this.thenCallback(value);
            }
        };

        function reject(){}
        executor(resolve,reject);
    }
    // add methods to return on the instance
    catch(){

    }
    then(callback) {
        this.thenCallback = callback;
        return this;
    }

}

module.exports = Pact;