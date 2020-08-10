/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_5_agosto;

import ico.fes.poo.Automovil;

/**
 *
 * @author Perro de Tindalo
 */
public class Sesion_5_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil miCarro = new Automovil();
    miCarro.marca = "VW";
    //miCarro.subMarca = "Golf";
    //miCarro.modelo = 1990;
    //miCarro.color = "Gris";
    miCarro.setModelo (1990);
    float x = miCarro.avanzar(1000);
        System.out.println("Avanzados=" + x);
    
        Automovil miCarroDos = new Automovil();
        miCarroDos.marca = "Ford";
        //miCarroDos.subMarca = "Mustang";
        //miCarroDos.modelo = 2010;
        //miCarroDos.color = "amarillo";
        miCarroDos.setModelo (2010);
        
        System.out.println("Avanzados = " + miCarroDos.avanzar (500) );
        
        Automovil miCarroTres =new Automovil();
        miCarroTres.marca = "Acura";
        //miCarroTres.subMarca = "NSX";
        //miCarroTres.modelo = 2013;
        //miCarroTres.color = "Gris";
        miCarroTres.setModelo (2013);
       // miCarroTres.setMarca();
        
        System.out.println("Avanzados = " + miCarroTres.avanzar (800));
     
        System.out.println(miCarro);
        System.out.println(miCarroDos);
        System.out.println(miCarroTres);
    }
    
}
