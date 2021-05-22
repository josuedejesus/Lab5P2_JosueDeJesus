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

    private int codigo;
    
    public Admin() {
        super();
    }

    public Admin(int codigo, String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Admin{" + "codigo=" + codigo + '}';
    }

    
    
}
