function addScore(players) {
    return players.map(function(player){
        return {
            id: player.id,
            score: player.score + 10
        }
    });
}

module.exports = addScore;