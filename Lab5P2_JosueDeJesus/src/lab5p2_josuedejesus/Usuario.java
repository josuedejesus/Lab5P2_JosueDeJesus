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
public class Usuario extends Persona{
    private Date fecha;
    private int telefono;
    private String correo;
    private String genero;

    public Usuario() {
        super();
    }

    public Usuario(Date fecha, int telefono, String correo, String genero, String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
        this.fecha = fecha;
        this.telefono = telefono;
        this.correo = correo;
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "fecha=" + fecha + ", telefono=" + telefono + ", correo=" + correo + ", genero=" + genero + '}';
    }

    
}
