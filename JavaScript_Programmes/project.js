let systemInput = Math.ceil(Math.random() * 100);
console.log(systemInput);

let guess = 0;
let userInput = parseInt(prompt(`Enter a Number`));
//converting the input to integer

let userInput1 = () => {
    userInput = parseInt(prompt(`Enter the Correct Number`));

};
if (isNaN(userInput)) {
    alert("Please Enter A Valid Input");
}
while(systemInput != userInput){
    alert( "Wrong Guess! Try Again!");
    userInput1();
    guess++;
}
if(systemInput == userInput){
    alert(`You Enter the Correct Number,It's ${systemInput}`);
}
console.log(`You guess are`+guess);