const fs = require('fs');
let input = fs.readFileSync(0).toString().trim();

let answer = 'False';

if (Number(input) % 13 === 0 || Number(input) % 19 === 0) {
    answer = 'True';
}

console.log(answer);