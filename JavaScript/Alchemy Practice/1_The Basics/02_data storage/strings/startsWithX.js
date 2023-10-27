function startsWithX(string) {
    return string.charAt(0).toLowerCase() === "x";
}

module.exports = startsWithX;

console.log(startsWithX("Vaishnavi"));
console.log(startsWithX("xantheum"));
console.log(startsWithX("Xylophone"));