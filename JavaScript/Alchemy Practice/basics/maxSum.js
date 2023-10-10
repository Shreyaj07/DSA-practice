function maxSum(num) {
    if(num<0){
        return 0;
    }
    return num*(num+1)/2;
}

module.exports = maxSum;

console.log(maxSum(4));
console.log(maxSum(1));
