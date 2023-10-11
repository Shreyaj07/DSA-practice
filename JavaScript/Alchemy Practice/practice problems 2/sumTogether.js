function sumTogether(arr1, arr2) {
    let newArr = []
    for(let i=0; i<arr1.length; i++){
        newArr[i]  = arr1[i]+arr2[i];
    }
    return newArr;
}

module.exports = sumTogether;