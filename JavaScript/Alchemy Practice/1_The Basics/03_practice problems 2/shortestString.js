function shortestString(str1, str2) {
    return str1.length < str2.length ? str1 : str2;
}

module.exports = shortestString;

console.log(shortestString("Elephant", "mouse"))