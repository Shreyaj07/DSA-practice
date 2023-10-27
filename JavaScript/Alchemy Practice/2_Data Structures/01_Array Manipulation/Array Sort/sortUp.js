function sortUp(array) {
    return array.sort(function comparison(a,b){
        return a-b;
    });
}

module.exports = sortUp;