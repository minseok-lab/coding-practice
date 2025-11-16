const fs = require('fs');
let temp = fs.readFileSync(0).toString().trim();

const n = Number(temp);

if (n < 0) {
    console.log('ice');
} else if (n >= 100) {
    console.log('vapor');
} else {
    console.log('water');
}