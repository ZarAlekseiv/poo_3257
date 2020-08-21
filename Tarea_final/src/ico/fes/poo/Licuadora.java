/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author Perro de Tindalo
 */
public class Licuadora extends Electrodomestico {
    private int numAspas;
    private int numVelocidades;
    private String materialVaso;
    private float capacacidadVaso; 

    public Licuadora() {
    }

    public Licuadora(int numAspas, int numVelocidades, String materialVaso, float capacacidadVaso) {
        this.numAspas = numAspas;
        this.numVelocidades = numVelocidades;
        this.materialVaso = materialVaso;
        this.capacacidadVaso = capacacidadVaso;
    }

    public Licuadora(int numAspas, int numVelocidades, String materialVaso, float capacacidadVaso, String marca, String modelo, String color, int precio) {
        super(marca, modelo, color, precio);
        this.numAspas = numAspas;
        this.numVelocidades = numVelocidades;
        this.materialVaso = materialVaso;
        this.capacacidadVaso = capacacidadVaso;
    }

    public float getCapacacidadVaso() {
        return capacacidadVaso;
    }

    public void setCapacacidadVaso(float capacacidadVaso) {
        this.capacacidadVaso = capacacidadVaso;
    }

    public int getNumAspas() {
        return numAspas;
    }

    public void setNumAspas(int numAspas) {
        this.numAspas = numAspas;
    }

    public int getNumVelocidades() {
        return numVelocidades;
    }

    public void setNumVelocidades(int numVelocidades) {
        this.numVelocidades = numVelocidades;
    }

    public String getMaterialVaso() {
        return materialVaso;
    }

    public void setMaterialVaso(String materialVaso) {
        this.materialVaso = materialVaso;
    }

    @Override
    public String toString() {
        return "Licuadora{" + "numAspas=" + numAspas + ", numVelocidades=" + numVelocidades + ", "
                + "materialVaso=" + materialVaso + ", capacacidadVaso=" + capacacidadVaso + '}'+ super.toString();
    }
    
    public void usar(){
        System.out.println("Se está usando la licuadora en la modalidad de ");
     
        switch(this.numVelocidades){
            case 0:
                System.out.println("Apagado");
                
                break;
        case 1:
                System.out.println("Licuar");
                
                break;
                case 2:
                System.out.println("Triturar");
                
                break;
                default: 
                    System.out.println("Frappe");
        }
        
        
        
    }
    
}
