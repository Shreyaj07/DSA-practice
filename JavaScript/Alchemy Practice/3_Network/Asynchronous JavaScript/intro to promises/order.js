const { makeFood } = require('./Kitchen');

class Order {
    constructor() {
        this.isReady = false;
    }
    request(food) {
        const promise = makeFood(food);
        return promise.then(() => {
            this.isReady = true;
        })
    }
}

module.exports = Order;