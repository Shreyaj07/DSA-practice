function countC(str) {
    let count =0;
    str = str.toLowerCase();
    for(let i=0; i<str.length; i++){
        if(str.charAt(i)==='c'){
            count++;
        }
    }
    return count;
}

module.exports = countC;

console.log(countC("Consecutive"))