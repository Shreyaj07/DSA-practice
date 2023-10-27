function playerHandScore(hand) {
    let sum =0;
    for(let i=0; i<hand.length ;i++){
        let ch = hand.charAt(i);
        sum+= CONSTANT[ch];
    }
    return sum;
}
const CONSTANT = {
    "K":4,
    "Q":3,
    "J":2
}
module.exports = playerHandScore;

console.log( playerHandScore("KQQ") );