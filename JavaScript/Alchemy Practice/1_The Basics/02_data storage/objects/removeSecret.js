function removeSecret(object) {
    delete object.secret
}

module.exports = removeSecret;

const person = {
    name: "Bob"
}

delete person.name;

console.log( person.name ); // undefined