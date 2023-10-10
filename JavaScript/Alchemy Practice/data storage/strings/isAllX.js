function isAllX(string) {
    string = string.toLowerCase();
    for(let i=0; i<string.length; i++){
        if(string[i]!=='x'){
            return false;
        }
    }
    return true;
}

module.exports = isAllX;
