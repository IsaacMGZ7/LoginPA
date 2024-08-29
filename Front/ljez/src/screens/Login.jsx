import React, { useState } from "react";
import "./Login.css";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import { useContext } from "react";
import { AuthUserContext } from "../context/authUser";

function Login() {
  const [credentials, setCredentials] = useState({ Usuario: "", Clave: "" });
  const navigate = useNavigate();
  const {setIsLogged}=useContext(AuthUserContext)

  const onLogin = async (e) => {
    e.preventDefault();
    
    try {
      const response = await axios.post('http://localhost:8080/usuarios/login', {
        Headers: {
          "Content-Type": "application/json; charset=utf-8",
          "Access-Control-Allow-Credentials": "true"
        },

        email: credentials.Usuario,
        password: credentials.Clave
      });
      const data = response.data;
      console.log(data);
      console.log(response);
      if (response.status === 200) {
        alert("Inicio de sesión exitoso");
        setIsLogged(true);
        localStorage.setItem("UsuarioActivo", credentials.Usuario);
      } else {
        alert("Usuario o contraseña incorrectos");
      }
    } catch (error) {
      console.log(error);
      alert("Error en el inicio de sesión"+ error.type);
    }
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setCredentials((prevState) => ({
      ...prevState,
      [name]: value,
    }));
  };

  return (
    <div className="login-container">
      <div className="login-form">
        <form onSubmit={onLogin}>
          <h1>Iniciar Sesión</h1>
          <input
            type="text"
            className="Usuario"
            placeholder="Usuario"
            name="Usuario"
            value={credentials.Usuario}
            onChange={handleChange}
            required
          />
          <input
            type="password"
            className="Clave"
            placeholder="Clave"
            name="Clave"
            value={credentials.Clave}
            onChange={handleChange}
            required
          />
          <button type="submit">Iniciar Sesión</button>
        </form>
      </div>
    </div>
  );
}

export default Login;