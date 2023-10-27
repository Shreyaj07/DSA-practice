function lessThanFive(array) {
    return array.filter((function(element) {
        return (element < 5);
    }));
}

module.exports = lessThanFive;