/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_josuedejesus;

/**
 *
 * @author josue
 */
public class Admin extends Persona{

    private String nombre;
    
    public Admin() {
        super();
    }

    public Admin(String nombre, String usuario, String contrasena) {
        super(usuario, contrasena);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Admin{" + "nombre=" + nombre + '}';
    }
    
    
}
