import React from 'react';
import '../css/Footer.css'

function Footer() {
  return (
    <footer className="footer">
      <div className="container">
        <div className="row">
          <div className="col-lg-6">
            <h3>About Us</h3>
            <p>Whether you're embarking on a new career journey or expanding your team,Your Job Portal  is your partner in success. Join us to unlock a world of opportunities, connections, and growth.
              At Web-Based Recruitment System , we're more than just a platform – we're your stepping stone to a brighter future.</p>
          </div>
          <div className="col-lg-3">
            <h3>Quick Links</h3>
            <ul className="list-unstyled">
              <li><a href="/">Home</a></li>
              <li><a href="/about">About</a></li>
              <li><a href="/services">Services</a></li>
              <li><a href="/contact">Contact</a></li>
            </ul>
          </div>
          <div className="col-lg-3">
            <h3>Contact Us</h3>
            <p>Email: rushi.b1111@gmail.com</p>
            <p>Email: jay-jaykumar@gmail.com</p>
            <p>Phone: +91 7448121361</p>
          </div>
        </div>
        <div className="row">
          <div className="col-lg-12 text-center">
            <p>&copy; {new Date().getFullYear()} Pg-Dac. All Rights Reserved.</p>
          </div>
        </div>
      </div>
    </footer>
  );
}

export default Footer;
