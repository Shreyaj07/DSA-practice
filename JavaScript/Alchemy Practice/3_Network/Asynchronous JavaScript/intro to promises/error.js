const { makeFood } = require('./Kitchen');

class Order {
    constructor() {
        this.isReady = false;
    }
    request(food) {
        const promise = makeFood(food);
        return promise.then(() => {
            this.isReady = true;
        }).catch((err) =>{
            this.error = err;
        })
    }
}

module.exports = Order;