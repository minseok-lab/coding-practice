const fs = require("fs");
let num = fs.readFileSync(0).toString().trim().split(' ');

const a = Number(num[0]);
const b = Number(num[1]);

if (a > b) {
    console.log(a * b);
} else {
    console.log(Math.floor(b / a));
}