function thisName() {
    return this.name;
}

const boundThisName = thisName.bind({ name: 'Bob' });

module.exports = boundThisName;
