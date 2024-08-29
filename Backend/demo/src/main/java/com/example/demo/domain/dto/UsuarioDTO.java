package com.example.demo.domain.dto;

public class UsuarioDTO {
    private String Usuario, Nombre_Completo, Correo, Clave, FechaRegistro;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getNombre_Completo() {
        return Nombre_Completo;
    }

    public void setNombre_Completo(String nombre_Completo) {
        Nombre_Completo = nombre_Completo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        FechaRegistro = fechaRegistro;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

    private boolean Estado;

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "Usuario='" + Usuario + '\'' +
                ", Nombre_Completo='" + Nombre_Completo + '\'' +
                ", Correo='" + Correo + '\'' +
                ", Clave='" + Clave + '\'' +
                ", FechaRegistro='" + FechaRegistro + '\'' +
                ", Estado=" + Estado +
                '}';


    }
}
