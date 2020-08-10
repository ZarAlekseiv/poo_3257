/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_3;

import ico.fes.poo.Smartphone;
/**
 *
 * @author Perro de Tindalo
 */
public class Tarea_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Smartphone miTelefono = new Smartphone ();
        
        miTelefono.marca = "Apple";
        miTelefono.modelo = "iPhone 11";
        miTelefono.color = "Plata";
        miTelefono.camara = 24;
        
         System.out.println( + miTelefono.ontelefono(13) + " iOS Version");
         System.out.println("El porcentaje de la bateria es de " + miTelefono.porcbateria(20)+ "%");
         System.out.println("La resolucion máxima de la cámara es de " + miTelefono.camara +" megapixeles\n");
         
          
        Smartphone miTelefonoDos = new Smartphone ();
        miTelefonoDos.marca = "Samsung";
        miTelefonoDos.modelo = "S10";
        miTelefonoDos.color = "Azul";
        miTelefonoDos.camara =20;
        
            System.out.println( + miTelefonoDos.ontelefono(10) + " Android SO Version");
            System.out.println("El porcentaje de batería es de " + miTelefonoDos.porcbateria(51) + "%" );
            System.out.println("La resolución máxima de la cámara es de " + miTelefonoDos.camara +" megapixeles\n");
            
             
        Smartphone miTelefonoTres = new Smartphone ();
        miTelefonoTres.marca = "Huawei";
        miTelefonoTres.modelo = "P20";
        miTelefonoTres.color = "Café";
        miTelefonoTres.camara =22;
        
            System.out.println( + miTelefonoTres.ontelefono(10) + " Android SO Version");
            System.out.println("El porcentaje de batería es de " + miTelefonoTres.porcbateria(45) + "%" );
            System.out.println("La resolución máxima de la cámara es de " + miTelefonoTres.camara +" megapixeles\n");
         
        Smartphone miTelefonoCuatro = new Smartphone ();
        miTelefonoCuatro.marca = "Motorola";
        miTelefonoCuatro.modelo = "Razer";
        miTelefonoCuatro.color = "Morado";
        miTelefonoCuatro.camara =23;
        
            System.out.println( + miTelefonoCuatro.ontelefono(12) + " Android SO Version");
            System.out.println("El porcentaje de batería es de " + miTelefonoCuatro.porcbateria(53) + "%" );
            System.out.println("La resolución máxima de la cámara es de " + miTelefonoCuatro.camara +  " megapixeles\n");
    }
   
}
