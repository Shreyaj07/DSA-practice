function unique(array) {
    let arr = []
    for(let i=0; i<array.length; i++){
        if(arr.indexOf(array[i])!==-1){
            continue;
        }
        arr.push(array[i]);
    }
    return arr;
}

module.exports = unique;