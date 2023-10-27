function unique(array) {
    return array.filter((value, index, self) =>
        self.indexOf(value) === index);
}


module.exports = unique;