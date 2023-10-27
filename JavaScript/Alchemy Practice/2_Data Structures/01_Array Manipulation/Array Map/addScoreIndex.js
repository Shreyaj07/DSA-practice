function addScore(players) {
    return players.map(function(player, position){
        return {
            id: player.id,
            score: position < 3? player.score+10 : player.score
        }
    });
}

module.exports = addScore;