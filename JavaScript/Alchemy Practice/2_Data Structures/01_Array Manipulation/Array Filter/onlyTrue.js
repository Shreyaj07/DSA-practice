function onlyTrue(array) {
    return array.filter((function(element) {
        return element===true;
    }))
}

module.exports = onlyTrue;