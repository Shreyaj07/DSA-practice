function fizzBuzz(numbers) {
    let string = "";
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] % 3 === 0 && numbers[i] % 5 === 0) {
            string += "fizzbuzz";
        } else if (numbers[i] % 3 === 0) {
            string += "fizz";
        } else if (numbers[i] % 5 === 0) {
            string += "buzz";
        }
    }
    return string.trim();
}

module.exports = fizzBuzz;