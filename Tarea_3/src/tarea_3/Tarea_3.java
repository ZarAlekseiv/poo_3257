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
        //float x = miTelefono.porcbateria(20);
       //System.out.println("Presione la pantalla para tomar la foto");
        //System.out.println("La resolucion es de " + miTelefono.camara + " megapixeles" );
        System.out.println("El porcentaje de la bateria es de " + miTelefono.porcbateria(12)+ "%");
         System.out.println("La resolucion máxima de la cámara es de " + miTelefono.camara +" megapixeles\n");
        
        Smartphone miTelefonoDos = new Smartphone ();
        miTelefonoDos.marca = "Samsung";
        miTelefonoDos.modelo = "S10";
        miTelefonoDos.color = "Azul";
        miTelefonoDos.camara =20;
        
            System.out.println("El porcentaje de batería es de " + miTelefonoDos.porcbateria(50) + "%" );
            System.out.println("La resolución máxima de la cámara es de " + miTelefonoDos.camara +" megapixeles\n");
             
             
        Smartphone miTelefonoTres = new Smartphone ();
        miTelefonoTres.marca = "Huawei";
        miTelefonoTres.modelo = "P20";
        miTelefonoTres.color = "Café";
        miTelefonoTres.camara =22;
        
            
            System.out.println("El porcentaje de batería es de " + miTelefonoTres.porcbateria(38) + "%" );
            System.out.println("La resolución máxima de la cámara es de " + miTelefonoTres.camara +" megapixeles\n");
         
        Smartphone miTelefonoCuatro = new Smartphone ();
        miTelefonoCuatro.marca = "Motorola";
        miTelefonoCuatro.modelo = "Razer";
        miTelefonoCuatro.color = "Morado";
        miTelefonoCuatro.camara =18;
        
            System.out.println("El porcentaje de batería es de " + miTelefonoCuatro.porcbateria(53) + "%" );
            System.out.println("La resolución máxima de la cámara es de " + miTelefonoCuatro.camara +  " megapixeles\n");
    }
   
}
