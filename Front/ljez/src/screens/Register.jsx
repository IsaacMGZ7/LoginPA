import React from 'react'
import './Register.css'

function Register() {
  return (

    <div className="register-container">
      <div className="register-form">
        <form >
        <h1>Registro</h1>
        <input type="text" placeholder="Usuario" />
        <input type="text" placeholder="Nombre Completo" />
        <input type="email" placeholder="Correo electrónico" />
        <input type="password" placeholder="Contraseña" />
        <input type="password" placeholder="Confirmar contraseña" />
        <button>Registrarse</button>  
        </form>
        
      </div>
    </div>
    
  )
}

export default Register