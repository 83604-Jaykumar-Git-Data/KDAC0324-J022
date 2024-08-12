import './App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import { Routes,Route,Navigate } from 'react-router-dom';
import HomeComponent from './components/HomeComponent';

import Footer from './components/Footer';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<Navigate replace to="/home"></Navigate>}></Route>
        <Route path='/home' element={<HomeComponent/>}></Route>
        
      
      </Routes>
      <Footer/>
    </div>
  );
}

export default App;
