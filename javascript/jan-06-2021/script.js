// token -> expression -> statement -> block
// token is the smallest piece of code
// expression resolves to a value
// statement performs an action, in other words they do something
// block is simply a grouping of statements


class Rectangle {

    // height
    // width

    constructor(paramHeight, paramWidth) {
        this.height = paramHeight;
        this.width = paramWidth;
    }
}

// this is the superclass
class Parent {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}

// this is the subclass
class Child extends Parent {
    constructor(school, name, age) {
        super(name, age);
        this.school = school;
    }
}

class Car {
    constructor(engine, make, model) {
        this.engine = engine;
        this.make = make;
        this.model = model;
    }
}

// class Car(engine, make, model);

class Engine {
    constructor(name) {
        this.name = name;
    }
}

const myCar = new Car(new Engine(`myEngine`), `myMake`, `myModel`);

console.log(myCar);

const myChild = new Child(`Weaver High`, `Timmy`, `14`);
console.log(myChild);



// classes are syntatic sugar that immediately invoked functional expression (IIFE)

// (function () {
//     console.log(`I am inside an IIFE`);
// })();

(function (height, width) {
    height = 5;
    width = 4;
    console.log(height);
})();

// here we're making an instance of the class Rectangle
const myObject = new Rectangle();
// the type of my arguments can be arbitrary
const otherObject = new Rectangle(4, "My is Lionel");

console.log(myObject);
console.log(otherObject);

otherObject.width = 5;

console.log(otherObject);

// this is illegal! We cannot reassign constants!
// otherObject = new Rectangle();

console.log(otherObject);

// const myFunction = () => {
//     const myNum = 4;
//     myNum++; 
// }

// myFunction();

// console.log(myNum);

function varTest() {
    console.log(`--inside varTest() function--`)
    var x = 1;

    function insideFunction() {
        var x = 3;
        console.log(x);
    }

    {
        var x = 2;
        console.log(x);
    }

    console.log(x);

    insideFunction();

}

varTest();

function letTest() {
    console.log(`--inside letTest() function--`)
    let x = 1;
    {
        let x = 2; // this is locally scoped 
        // console.log(x);
    }
    console.log(x); // this is still referencing the first x! 
}

letTest();

console.log(`--functional programming--`);

// functional programming can trace its roots to lambda calculus 

const myFunc = () => 4;
const otherFunction = (
    // this is my input
) => {
    // this is my output
};

// console.log(typeof otherFunction);
console.log(`call to hoisted function`);
console.log(otherAddTwo(4));

const addTwo = x => x + 2; // this arrow function cannot be hoisted! 

function otherAddTwo(x) {
    return x + 2; 
}

console.log(`call to arrow function`);
console.log(addTwo(4));