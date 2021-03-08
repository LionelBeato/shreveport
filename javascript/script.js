
// basic sanity check

console.log(`hello world`);
console.log('hello again');

// types

let x = 5; 
console.log("this is the type for my variable: "+ typeof x); 

let myString = "this is a string"; 
let myBoolean = true; 
let myNumber = 4; 
let myNull = null; 

let myBigInt = 43554353454522n;

console.log(typeof myBigInt);

// declaration vs initialization

let y; 
y = 2; 
console.log(y);


// functions

myFunction(); 

function myFunction(){
    console.log('I am within a function!');
}

let myOtherFunc = function() {
    console.log('hello');
};

myFunction();

let arrowFunc = () => {
    console.log('I am inside an arrow function.')
};

arrowFunc();

let paramFunc = (x) => x + 2;
let yetAnotherFunc = (x, y) => x + y;
let printerFunc = () => console.log('hello');

printerFunc();

let gfdggdsfd = () => console.log('this works too');

gfdggdsfd(); 

console.log(paramFunc(5));
console.log(yetAnotherFunc(5,10));

// conditionals and loops 

if (y === 2) {
    console.log('I am inside an if statement!');
}

if (y > 1){
    console.log('blah blah blah');
}


if (y < 1){
    console.log('blah blah blah');
}


if (y >= 1){
    console.log('blah blah blah');
}


if (y <= 1){
    console.log('blah blah blah');
}

// this is the modulo operator
// modulo will give back the remainder of a division operation
// below works because the value of 0 is "falsey"
// 1 should be "truthy"
if (y % 2){
    console.log('y is even');
}

for (i = 1; i <= 5; i += 3){
    // console.log(i);
    console.log('i am in a for loop');
}

for (i = 20; i >= 1; i--){
    // console.log(i);
    console.log('reverse card');
}

numArray = [1, 2, 3];

for (num of numArray) {
    console.log(num);
}