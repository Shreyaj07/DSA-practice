function map(arr, callback) {
    const newArray = [];
    for (let i = 0; i < arr.length; i++) {
        newArray.push(callback(arr[i], i));
    }

    return newArray;
}

module.exports = map;