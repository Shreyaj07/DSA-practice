// class Hero {
//     constructor() {
//         this.health = 50
//     }
// }

module.exports = Hero;
class Hero {
    constructor() {
        this.health = 50
    }
    takeDamage(damage){
        this.health -= damage;
    }
}

module.exports = Hero;