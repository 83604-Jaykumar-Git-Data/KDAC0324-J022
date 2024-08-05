import 'bootstrap/dist/css/bootstrap.min.css';
// import './SignIn.css'; // Add this for custom footer styling

const Footer = () => {
    

    return (
        <div className="container">
            <footer className="footer mt-5">
        <div className="container text-center">
          <p>&copy; {new Date().getFullYear()} Job Portal. All rights reserved.</p>
        </div>
      </footer>
        </div>
    );
};

export default Footer;
