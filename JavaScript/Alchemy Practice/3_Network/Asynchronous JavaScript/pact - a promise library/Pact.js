class Pact {
    constructor(executor){
        function resolve(){}
        function reject(){}
        executor(resolve,reject);
    }
    // add methods to return on the instance
    catch(){

    }
    then(){

    }
}

module.exports = Pact;