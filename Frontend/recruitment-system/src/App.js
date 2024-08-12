import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import { Routes, Route, Navigate } from "react-router-dom";
import HomeComponent from "./components/HomeComponent";
import JSHome from "./components/JSHome";

import Footer from "./components/Footer";

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
      </Routes>
      <Footer />
    </div>
  );
}

export default App;
