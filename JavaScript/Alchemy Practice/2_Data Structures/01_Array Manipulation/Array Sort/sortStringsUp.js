function sortStringsUp(string){
    return string.sort(function comparison(a,b){
        return a.localeCompare(b);
    });
}

module.exports = sortStringsUp;