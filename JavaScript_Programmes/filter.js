let a = [4,5,6,8,9,2];
let a1 = a.filter(greater_than);

 function greater_than(num) {
    return num>5;
 }
 console.log(a1)