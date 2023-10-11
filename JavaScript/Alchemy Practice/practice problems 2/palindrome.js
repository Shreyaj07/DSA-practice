function isPalindrome(string) {
    let n = string.length;
    for(let i=0; i<(n+1)/2; i++){
        if(string.charAt(i)!==string.charAt(n-1-i)){
            return false;
        }
    }
    return true;
}

module.exports = isPalindrome;