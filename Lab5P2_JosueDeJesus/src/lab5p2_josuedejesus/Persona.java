/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_josuedejesus;

import java.util.Date;

/**
 *
 * @author josue
 */
public class Persona {
    private String nombre;
    private String usuario;
    private String contrasena;

    public Persona() {
    }

    public Persona(String nombre, String usuario, String contrasena) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }

 
    
    
}
