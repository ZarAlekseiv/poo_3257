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
public class Editorial {
        private String Nombre;
        private String añoPublicacion;
        private int numeroPags;

    public Editorial() {
    }

    public Editorial(String Nombre, String añoPublicacion, int numeroPags) {
        this.Nombre = Nombre;
        this.añoPublicacion = añoPublicacion;
        this.numeroPags = numeroPags;
    }

    public int getNumeroPags() {
        return numeroPags;
    }

    public void setNumeroPags(int numeroPags) {
        this.numeroPags = numeroPags;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", a\u00f1oPublicacion=" + añoPublicacion + ", numeroPags=" + numeroPags + '}';
    }
       
    
        
}
