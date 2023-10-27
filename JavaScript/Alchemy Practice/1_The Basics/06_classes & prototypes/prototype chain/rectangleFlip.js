const Shape = require('./Shape');

// adding a prototype method

function Rectangle(x, y, height, width) {
    Shape.call(this,x,y);
    this.height = height;
    this.width = width;
}
Rectangle.prototype = Object.create(Shape.prototype);
Rectangle.prototype.flip = function(){
    temp = this.width;
    this.width = this.height;
    this.height = temp;
}

module.exports = Rectangle;