function sayHello() {
    let header = document.querySelector('#greeting');
    let hello = ('<h1> hello world and friends and enemies!!!!</h1>');
    header.innerHTML = hello; 
}

module.exports = sayHello();