function canBreathe(isConnected, hasOxygen, aboveWater) {
    if(!aboveWater){
        return isConnected && hasOxygen;
    }
    return isConnected || hasOxygen || aboveWater;
}

module.exports = canBreathe;