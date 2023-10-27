function numberOfKeys(object) {
    let sum =0;
    for(const key in object ){
        sum++;
    }
    return sum;
}

module.exports = numberOfKeys;

const object = { a: 1, b: 2, c: 3 }
console.log(numberOfKeys(object))