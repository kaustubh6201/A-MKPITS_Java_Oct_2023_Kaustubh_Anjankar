let range = parseInt(prompt`Enter the range of numbers: `);
let newarr = [];
for (let index = 0; index < range; index++) {
    let num = prompt(`Enter the ${index+1} Number`);
    newarr.push(num);
}
console.log(newarr);
// alert (`${newarr}`);
let num1 = newarr.map((value) => {
    return value*value;
});





