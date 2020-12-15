import logo from './logo.svg';
import './App.css';
import MyComponent from './MyComponent'; 
import Name from './Name'; 
import ThingILike from './ThingILike';

function App() {

  const x = 4; 

  return (
    <div>
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
      <h1>Hello World!</h1>
      
      <MyComponent />
      <Name />
      <ThingILike />
    
    </div>
  );
}

export default App;
