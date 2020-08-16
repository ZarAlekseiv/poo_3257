/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.book;

/**
 *
 * @author Perro de Tindalo
 */
public class Autor {

        private String apellido;
        private String nombre;
        private String generoLit;
        private String Nacionalidad;
        
        
    public Autor() {
    }

    public Autor(String apellido, String nombre, String generoLit, String Nacionalidad, int añoNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.generoLit = generoLit;
        this.Nacionalidad = Nacionalidad;
       
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroLit() {
        return generoLit;
    }

    public void setGeneroLit(String generoLit) {
        this.generoLit = generoLit;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "apellido=" + apellido + ", nombre=" + nombre + ", generoLit=" + generoLit + ", Nacionalidad=" + Nacionalidad + '}';
    }
    
}
