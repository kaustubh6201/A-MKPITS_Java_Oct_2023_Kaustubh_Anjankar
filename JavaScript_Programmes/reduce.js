let num = [5,6,1,7,3,2];
let num1 = num.reduce(add);///reduce the array into single value

function add (x,y){
    return x+y;

}
console.log(num1);