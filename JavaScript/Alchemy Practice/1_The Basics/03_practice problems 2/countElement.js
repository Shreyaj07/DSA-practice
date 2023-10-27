function countElements(elements) {
    const elementCount = {};

    for (const element of elements) {
        if (elementCount[element]) {
            elementCount[element]++;
        } else {
            elementCount[element] = 1;
        }
    }

    return elementCount;
}

module.exports = countElements;

const elements = ["e", "k", "e", "z", "i", "z"];
console.log(countElements(elements))