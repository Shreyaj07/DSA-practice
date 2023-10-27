// food is an array full of food objects
// let's group them by "type" and return them
const food = [
    { food: 'apple', type: 'fruit' },
    { food: 'orange', type: 'fruit' },
    { food: 'carrot', type: 'vegetable' }
]

function group(foods) {
    return foods.reduce((accumulator, currentValue) => {
        const foodType = currentValue.type;
        if (!accumulator[foodType]) {
            accumulator[foodType] = [];
        }
        accumulator[foodType].push(currentValue.food);
        return accumulator;
    }, {});
}

console.log(group(food))

module.exports = group;