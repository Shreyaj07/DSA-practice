/**
 * Runs a callback function immediately
 * @param {function} callbackFunction
 */
function runCallback(callbackFunction) {
    setTimeout(() => {
        callbackFunction();
    },1000);
    // callbackFunction();
}

module.exports = runCallback;