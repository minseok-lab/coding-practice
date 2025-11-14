const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(" ");

let num1 = Number(input[0]);
let num2 = Number(input[1]);

let totalValue = num1 + num2;
let averageValue = totalValue / 2;

console.log(`${totalValue} ${averageValue.toFixed(1)}`);
