
let x = 5; 

const myPromise = new Promise((res, rej) => {
    if (x > 4){
        setTimeout(() => {
            res(`promise resolved ${x}`);
        }, 2500)
    } else {
        rej("promise rejected");
    };
});

function invokePromise() {
myPromise.then(value => {
    console.log(value); 
}).catch(value => {
    console.log(value); 
}).finally(() => console.log("everything is done"))
}

async function asyncInvoke() {
    try {
        const response = await myPromise; 
        console.log(await response);
    }
    catch (err) {
        console.log(err);
    }
    finally {
        console.log("everything is done but async")
    }
}

asyncInvoke();
