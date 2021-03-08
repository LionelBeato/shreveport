import React, { useEffect, useState } from 'react'; // 👈 react and hooks import
import './Example.css'; // 👈 css import

const Example = () => {

    // first variable is a getter, second is a setter
    const [count, setCount] = useState(0); 

    // Similar to componentDidMount and componentDidUpdate:
    useEffect(() => {
        document.title = `You clicked ${count} times`; 
        alert('this is an alert');
        console.log('this is a log');
    })

    return (
        <div>
            <p>You clicked {count} times</p>
            <button onClick={() => setCount(count + 1)}>
                Click me
            </button>
        </div>
     
    );
}

export default Example;