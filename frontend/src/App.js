import './App.css';
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Appbar from './components/navbar'
import Home from './components/home';

function App() {
  return (
    <div className="App">

      <Router>
      <Appbar/>
        <Routes>
          <Route
            path="/"
            exact
            element={<Home/>}
          />

        </Routes>
      </Router>
    </div>
  );
}

export default App;
