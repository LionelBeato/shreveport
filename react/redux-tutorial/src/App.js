import logo from './logo.svg';
import './App.css';
import Counter from './Counter';
import AddTodo from './components/AddTodo';
import TodoList from './components/TodoList';
import VisibilityFilters from './components/VisibilityFilters';
import './styles.css'; 

function App() {
  return (
   <div className="todo-app">
     {/* <Counter /> */}
     <h1>Todo List</h1>
     <AddTodo />
     <TodoList />
     <VisibilityFilters />
   </div>
  );
}

export default App;
