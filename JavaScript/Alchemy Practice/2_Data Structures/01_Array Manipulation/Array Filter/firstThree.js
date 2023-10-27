function firstThree(array) {
    return array.filter((function(element, position){
        return position < 3;
    }));
}

module.exports = firstThree;