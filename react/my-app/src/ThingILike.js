import React from 'react'; 

const ThingILike = () => {

    const thingsILike = ['coding', 'reading', 'sleeping'];

    const listItems = thingsILike.map(thing => 
        <li>{thing}</li>
    );

    return (
        <ul>
            {listItems}
        </ul>
    )
}

export default ThingILike;