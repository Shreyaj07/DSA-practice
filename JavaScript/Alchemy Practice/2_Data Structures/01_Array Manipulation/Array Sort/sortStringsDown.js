function sortStringsDown(array) {
    return array.sort(function comparison(a,b){
        return b.localeCompare(a);
    })
}

module.exports = sortStringsDown;