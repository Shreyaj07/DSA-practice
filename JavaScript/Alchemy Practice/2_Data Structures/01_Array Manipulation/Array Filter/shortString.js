function shortStrings(array) {
    return array.filter(function(element){
        return element.length <= 3;
    })
}

module.exports = shortStrings;