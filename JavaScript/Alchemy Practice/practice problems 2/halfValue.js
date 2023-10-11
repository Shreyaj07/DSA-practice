function halfValue(numbers) {
    let new_arr = []
    for(let i =0 ; i<numbers.length; i++){
        new_arr[i] = Math.ceil(numbers[i]/2);
    }
    return new_arr;
}

module.exports = halfValue;