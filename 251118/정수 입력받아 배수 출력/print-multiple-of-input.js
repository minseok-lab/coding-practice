const fs = require('fs');
let input = fs.readFileSync(0).toString().trim();

let answer = '';

for (let i = 1; i <= 5 ; i++) {
    answer += (Number(input) * i) + ' ';
}

console.log(answer.trim());