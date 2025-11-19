const fs = require('fs');
let input = fs.readFileSync(0).toString().trim().split(' ');

let answer = '';

for (let i = Number(input[1]); i >= Number(input[0]); i--) {
    answer += i + ' ';
}

console.log(answer.trim());
