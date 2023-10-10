function removeOccurrences(array, num) {
    for (let i = array.length - 1; i >= 0; i--) {
        if (array[i] === num) {
            array.splice(i, 1);
        }
    }
}

module.exports = removeOccurrences;

arr = [2,2,2,4,5,2,5,7,2];
removeOccurrences(arr,3);
console.log(arr);