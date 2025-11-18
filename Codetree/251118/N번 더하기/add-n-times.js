const fs = require('fs');
let input = fs.readFileSync(0).toString().trim().split(' ');

for (let i = 0; i < Number(input[1]); i++) {
    console.log(Number(input[0]) + 0 + (Number(input[1]) * (i + 1)));
};