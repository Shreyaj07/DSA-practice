function hasOne(array) {
    for(let i=0; i<array.length; i++){
        if(array[i]===1){
            return true;
        }
    }
    return false;
}

module.exports = hasOne;

console.log(hasOne([2,34,5,1,45]))
console.log(hasOne([3,5]))