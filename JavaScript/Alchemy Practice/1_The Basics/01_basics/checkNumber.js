function checkNumber(num) {
    if(num===0){
        return "zero";
    }
    return num > 0 ? "positive" : "negative";
}

module.exports = checkNumber;

console.log(checkNumber(5));
console.log(checkNumber(-1));
console.log(checkNumber(0));