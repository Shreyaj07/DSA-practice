class Dialog {
    constructor(){
        this.arr = []
    }
    onClose(callbackFunction) {
        // store the callback
        callbackFunction();
    }

    close() {
        // invoke the callback
    }
}

module.exports = Dialog;