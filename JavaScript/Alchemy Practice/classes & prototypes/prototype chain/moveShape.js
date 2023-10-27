// Our Shape "Constructor"
function Shape(x, y) {
    // store x and y in this.position
    this.position = {x,y};
}
Shape.prototype.move = function(x,y) {
    this.position.x += x;
    this.position.y += y;
}
module.exports = Shape;