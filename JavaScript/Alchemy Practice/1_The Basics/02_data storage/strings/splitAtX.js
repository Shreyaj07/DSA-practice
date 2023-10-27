function splitAtX(string) {
    let index = string.indexOf("x");
    let before = string.slice(0,index);
    let after= string.slice(index+1, string.length);
    return after.length > before.length ? after : before;
}

module.exports = splitAtX;

console.log(splitAtX("HappyxBirthday"))