function endsWithX(string) {
    return string.charAt(string.length-1).toLowerCase() === "x";
}

module.exports = endsWithX;