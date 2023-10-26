const celebrities = {
    'Will Smith': 51,
    'Matt Damon': 49,
}

function fetchAge(name, cb) {
    cb(celebrities[name]);
}

module.exports = fetchAge;
