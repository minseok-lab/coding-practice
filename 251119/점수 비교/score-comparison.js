const fs = require('fs');
let input = fs.readFileSync(0).toString().trim().split('\n');
let aScore = input[0].split(' ');
let bScore = input[1].split(' ');

let answer = 0;

if (Number(aScore[0]) > Number(bScore[0])
    && Number(aScore[1]) > Number(bScore[1])) {
    answer = 1;
}

console.log(answer);