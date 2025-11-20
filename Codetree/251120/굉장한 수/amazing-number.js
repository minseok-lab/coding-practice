const fs = require('fs');
let input = fs.readFileSync(0).toString().trim();

console.log((Number(input) % 2 != 0 && Number(input) % 3 == 0) 
    || (Number(input) % 2 == 0 && Number(input) % 5 == 0));