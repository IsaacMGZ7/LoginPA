import React from "react";
//import Navbar from "../components/Navbar";
import "./Home.css";
import Footer from "../components/Footer";
import { Link } from "react-router-dom";

function Home() {
  
  return (
    <div>
      <h1>
        Bienvenidos a LJEZ.com <br /> Aprende a tu propioritmo
      </h1>
      <br />
      <p className="frist">
        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Dignissimos
        aut, voluptas eveniet quia, quidem perspiciatis esse quo sit labore
        magnam iure nemo sed deserunt quis in! Quae laboriosam excepturi omnis?
        Lorem ipsum dolor sit, amet consectetur adipisicing elit. Consequatur,
        cumque delectus officia laboriosam earum voluptatibus, perspiciatis
        quidem tempore illo obcaecati laborum aliquam, blanditiis consequuntur
        minima placeat. Laudantium veniam necessitatibus officia. Lorem ipsum
        dolor sit amet consectetur adipisicing elit. Repudiandae doloremque
        impedit dolore quasi! Ad nam rem dicta accusamus quibusdam ducimus optio
        velit quo, perspiciatis voluptas ipsam similique facere, a nemo?
      </p>
      <h3>Cursos disponibles</h3>
      <div className="card">
        <img src="https://source.unsplash.com/random/300x200" alt="Imagen 1" />
        <h2 className="title-card">Español</h2>
        <p>
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod,
          nisl nec ultricies lacinia, nisl nisl aliquet nisl, eget aliquam nisl
          nisl eget nisl.
        </p>
        <p className="a">
          <Link to="/español">Aprende dando click aquí.</Link>
        </p>
      </div>
      <div className="card">
        <img src="https://source.unsplash.com/random/300x200" alt="Imagen 2" />
        <h2 className="title-card">Frances</h2>
        <p>
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod,
          nisl nec ultricies lacinia, nisl nisl aliquet nisl, eget aliquam nisl
          nisl eget nisl.
        </p>
        <p className="a">
            <Link to="/frances">Aprende dando click aquí.</Link>
        </p>
      </div>
      <div className="card">
        <img src="https://source.unsplash.com/random/300x200" alt="Imagen 3" />
        <h2 className="title-card">Ingles</h2>
        <p>
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod,
          nisl nec ultricies lacinia, nisl nisl aliquet nisl, eget aliquam nisl
          nisl eget nisl.
        </p>
        <p className="a">
          <Link to="/ingles">Aprende dando click aquí.</Link>
        </p>
      </div>
      <p className="frist">
        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Dignissimos
        aut, voluptas eveniet quia, quidem perspiciatis esse quo sit labore
        magnam iure nemo sed deserunt quis in! Quae laboriosam excepturi omnis?
        Lorem ipsum dolor sit, amet consectetur adipisicing elit. Consequatur,
        cumque delectus officia laboriosam earum voluptatibus, perspiciatis
        quidem tempore illo obcaecati laborum aliquam, blanditiis consequuntur
        minima placeat. Laudantium veniam necessitatibus officia. Lorem ipsum
        dolor sit amet consectetur adipisicing elit. Repudiandae doloremque
        impedit dolore quasi! Ad nam rem dicta accusamus quibusdam ducimus optio
        velit quo, perspiciatis voluptas ipsam similique facere, a nemo?
      </p>
      <Footer />
    </div>
  );
}
export default Home;
