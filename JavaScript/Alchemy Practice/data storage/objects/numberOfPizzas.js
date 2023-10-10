function numberOfPizzas(order) {
    return order.pizzas;
}

function numberOfPizzas(orders) {
    let sum = 0;
    for (let i = 0; i < orders.length; i++) {
        sum += orders[i].pizzas;
    }
    return sum;
}

const orders = [
    { pizzas: 3 },
    { pizzas: 5 },
    { pizzas: 10 }
];

console.log(numberOfPizzas(orders))