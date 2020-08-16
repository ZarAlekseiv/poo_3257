/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.lbs;
 
import ico.fes.book.Autor;
import ico.fes.book.Editorial;


/**
 *
 * @author Perro de Tindalo
 */
public class Libros {
    
    private String nom_libro;
    private Autor mi_Autor;
    private Editorial mi_Edit;

    public Libros() {
    }

    public Libros(String nom_libro, Autor mi_Autor, Editorial mi_Edit) {
        this.nom_libro = nom_libro;
        this.mi_Autor = mi_Autor;
        this.mi_Edit = mi_Edit;
    }

    public Editorial getMi_Edit() {
        return mi_Edit;
    }

    public void setMi_Edit(Editorial mi_Edit) {
        this.mi_Edit = mi_Edit;
    }

    public String getNom_libro() {
        return nom_libro;
    }

    public void setNom_libro(String nom_libro) {
        this.nom_libro = nom_libro;
    }

    public Autor getMi_Autor() {
        return mi_Autor;
    }

    public void setMi_Autor(Autor mi_Autor) {
        this.mi_Autor = mi_Autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "nom_libro=" + nom_libro + ", mi_Autor=" + mi_Autor + ", mi_Edit=" + mi_Edit + '}';
    }
    
    
}
