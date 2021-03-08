import './App.css';
import MyComponent from './MyComponent'; 
import Name from './Name'; 
import ThingILike from './ThingILike';
import Example from './Example'; 

function App() {

  // const x = 4; 

  return (
    <div>
      <h1 className="text">Hello World!</h1>
      
      <MyComponent />
      <Name firstName="Merideth" lastName="Bates"/>
      <Name firstName="Beth" lastName="Bates"/>
      <Name firstName="Agnes" lastName="Bates"/>
      <ThingILike />
      <Example /> 
    
    </div>
  );
}

export default App;
