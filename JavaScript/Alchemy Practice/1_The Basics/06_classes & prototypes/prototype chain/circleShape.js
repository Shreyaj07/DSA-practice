const Shape = require('./Shape');

function Circle(x, y, radius) {
    Shape.call(this,x,y);
    // store radius on this
    this.radius = radius;
}

module.exports = Circle;