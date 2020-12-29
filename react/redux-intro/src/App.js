import logo from './logo.svg';
import './App.css';
import Counter from './Counter'; 
import { Provider } from 'react-redux';
import { createStore } from 'redux';

const initialState = {
  count: 0
};

function reducer(state = initialState, action) {
  
  if(action.type === 'INCREMENT') {
    return {
      count: state.count + 1
    }
  }
  if(action.type === 'DECREMENT') {
    return {
      count: state.count - 1
    }
  }

  return state;
}

const store = createStore(reducer);

function App() {
  return (
    <Provider store={store}>
    <div>
      <Counter />
    </div>
   </Provider>
  );
}

export default App;
