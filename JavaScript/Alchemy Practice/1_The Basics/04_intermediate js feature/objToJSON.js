function toJSON(obj) {
    return JSON.stringify(obj);
}
const details = {
    name:"Vaishnavi",
    cno:"1023",
    branch:"computer"
}
console.log(JSON.stringify(details))
module.exports = toJSON;