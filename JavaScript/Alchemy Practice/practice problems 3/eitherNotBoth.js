function eitherNotBoth(num) {
    if(num %15 ==0 ){
        return false;
    }else if(num %3 ==0 ){
        return true;
    }else if(num%5==0){
        return true;
    }
    return false;
}

module.exports = eitherNotBoth;