const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(" ");

let totalValue = 0;
for (let i = 0; i < input.length; i++) {
    totalValue += Number(input[i]);
}
let averageValue = totalValue / input.length;

console.log(totalValue);
console.log(averageValue);
console.log(totalValue - averageValue);