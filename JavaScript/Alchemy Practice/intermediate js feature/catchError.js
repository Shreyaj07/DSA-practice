function catchError(fn) {
    try{
        fn();
    }catch(e){
        return e;
    }
    return false;
}

module.exports = catchError;

function startError() {
    // try{
    const x = 3;
    x();
    const a = new Array(Infinity);
    // }catch(e){
    //     return e;
    // }
    // return false;
}

module.exports = startError;

