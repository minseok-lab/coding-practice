const fs = require("fs");
let num = fs.readFileSync(0).toString().trim().split(' ');

const A = Number(num[0]);
const B = Number(num[1]);

if (A > B) {
    console.log(A * B);
} else {
    console.log((B / A).toFixed(0));
}