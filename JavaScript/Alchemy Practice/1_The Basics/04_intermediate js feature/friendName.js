function friendName(friend) {
    if(friend === undefined){
        return undefined;
    }
    return friend.name;
}

module.exports = friendName;