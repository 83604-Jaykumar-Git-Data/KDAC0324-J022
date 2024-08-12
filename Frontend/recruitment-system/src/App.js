import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import { Routes, Route, Navigate } from "react-router-dom";
import HomeComponent from "./components/HomeComponent";
import JSHome from "./components/JSHome";
import AdminHome from './components/AdminHome';
import Footer from "./components/Footer";
import JSUpdate from "./components/JSUpdate";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route
          path="/"
          element={<Navigate replace to="/home"></Navigate>}
        ></Route>
        <Route path="/home" element={<HomeComponent />}></Route>
        <Route path="/jobseeker/home" element={<JSHome></JSHome>}></Route>
        <Route path="/jobseeker/update" element={<JSUpdate />}></Route>
        <Route path='/admin/home' element={<AdminHome></AdminHome>}></Route>
      </Routes>
      <Footer />
    </div>
  );
}

export default App;
