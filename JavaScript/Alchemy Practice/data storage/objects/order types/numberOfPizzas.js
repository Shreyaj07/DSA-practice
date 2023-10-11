const {PIZZA, WINGS} = require("./orderTypes");

function numberOfPizzas(orders) {
    let sum = 0;
    const ORDER_TYPES = require("./orderTypes");
    for (let i = 0; i < orders.length; i++) {
        if (orders[i].type === ORDER_TYPES.PIZZA) {
            sum += orders[i].pizzas;
        }
    }
    return sum;
}

module.exports = numberOfPizzas;

const orders = [
    {pizzas: 3, type: PIZZA},

    {wings: 12, type: WINGS},
];
console.log(numberOfPizzas(orders))