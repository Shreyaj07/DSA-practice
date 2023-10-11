function countVowels(str) {
    let vowel = 0;
    let vowels = ['a','e','i','o','u']
    str = str.toLowerCase();
    for(let i=0; i<str.length; i++){
        let ch = str.charAt(i);
        if(vowels.indexOf(ch) >= 0){
            vowel++;
        }
    }
    return vowel;
}

module.exports = countVowels;