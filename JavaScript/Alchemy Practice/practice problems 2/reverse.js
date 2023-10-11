function reverse(string) {
    let reverseString = "";
    for(let i=string.length-1; i>=0; i--){
        reverseString+=string.charAt(i);
    }
    return reverseString;
}

module.exports = reverse;