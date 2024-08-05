// import Footer from "./Footer";

const Home = () => {
  return (
    <>
    
      <div class="m-5" height="200vh" style={{ textAlign: "center" }}>
        <h1>Welcome To The Job Portal</h1>
        <p>
          Find your dream job here. Explore opportunities from top companies
        </p>
      </div>
      <div>
        <marquee width="100%" direction="left" height="230px" scrollamount="20">
          <img src={"images/adobe.png"} alt="BigCo Inc. logo" />
          <img src={"images/amazon.png"} alt="BigCo Inc. logo" />
          <img src={"images/flipkart.png"} alt="BigCo Inc. logo" />
          <img src={"images/netflix.png"} alt="BigCo Inc. logo" />
          <img src={"images/meta.png"} alt="BigCo Inc. logo" />
          <img src={"images/microsoft.png"} alt="BigCo Inc. logo" />
          <img src={"images/swiggy.png"} alt="BigCo Inc. logo" />
          <img src={"images/uber.png"} alt="BigCo Inc. logo" />
          <img src={"images/walmart.png"} alt="BigCo Inc. logo" />
          <img src={"images/zomato.png"} alt="BigCo Inc. logo" />
        </marquee>
      </div>
      {/* <Footer /> */}
    </>
  );
};

export default Home;