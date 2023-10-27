function toNumber(string) {
    const result = parseInt(string);

    if (Number.isNaN(result)) {
        return 0;
    }

    return result;
}

module.exports = toNumber;