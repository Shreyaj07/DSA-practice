function sortDown(array) {
    return array.sort(function comparison(a,b){
        return b-a;
    });
}

module.exports = sortDown;