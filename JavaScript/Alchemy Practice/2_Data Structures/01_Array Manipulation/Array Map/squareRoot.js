function squareRoot(arr) {
    function sqRoot(x){
        return Math.sqrt(x);
    }
    return arr.map(sqRoot);
}

module.exports = squareRoot;