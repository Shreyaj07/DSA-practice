const { MAX_STACK_SIZE } = require('./config');

class Stack {
    constructor() {
        this.items = [];
    }
    push(item) {
        if(this.items.length===MAX_STACK_SIZE){
            throw new Error("Stack Overflow");
        }
        this.items.push(item);
    }
    pop() {
        if(this.isEmpty()){
            throw new Error("Stack underflow");
        }
        return this.items.pop();
    }
    isEmpty() {
        return this.items.length===0;
    }
    peek() {
        if(this.isEmpty()){
            return -1;
        }
        return this.items[this.items.length-1];
    }
}

module.exports = Stack;
