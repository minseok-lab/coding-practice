const fs = require('fs');
let money = fs.readFileSync(0).toString().trim();

const n = Number(money);

if (n >= 3000) {
    console.log('book');
} else if (n >= 1000) {
    console.log('mask');
} else {
    console.log('no');
}