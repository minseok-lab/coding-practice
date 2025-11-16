const fs = require('fs');
let num = fs.readFileSync(0).toString().trim().split(' ');

const a = Number(num[0]);
const b = Number(num[1]);

let answer1 = 0;
let answer2 = 0;

if (a < b) {
    answer1 = 1;
} else {
    answer1 = 0;
}

if (a == b) {
    answer2 = 1;
} else {
    answer2 = 0;
}

console.log(answer1, answer2);