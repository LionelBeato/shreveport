import React from 'react';

const Name = (props) => {
    const myName = 'Lionel';

    /* 
    in functional components, props are treated like another paramater in any ol' function
    Thus, they can be used as a variable reference like any other reference
    👇 */
    // const x = props.customName;

    // more than one props is possible! 
    return (
        <h1>{props.firstName /* first name property*/} {props.lastName /* last name property */}</h1>  
        
    )
}

export default Name; 