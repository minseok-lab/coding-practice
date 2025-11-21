const fs = require('fs');
let input = fs.readFileSync(0).toString().trim().split(' ');

let answer = [];
for (let i = 0; i < input.length; i++){
    answer.push(Number(input[i]));
}

answer.sort((a, b) => a - b);

console.log(answer[1]);