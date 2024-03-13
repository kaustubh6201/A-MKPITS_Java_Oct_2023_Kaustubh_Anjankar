let range =parseInt( prompt (`Enter the Range`));
let myarr = [];
for (let index = 0; index < range; index++) {
  let arr =prompt(`Enter ${index+1} array`); 
   myarr.push(arr);
}
alert(`${myarr}`);
