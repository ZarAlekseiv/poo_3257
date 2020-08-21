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
public class Refrigerador extends Electrodomestico{
    private float tamaño;
    private int numPuertas;
    private String material;
    private int consumoElectricidad;

    public Refrigerador() {
    }

    public Refrigerador(float tamaño, int numPuertas, String material, int consumoElectricidad) {
        this.tamaño = tamaño;
        this.numPuertas = numPuertas;
        this.material = material;
        this.consumoElectricidad = consumoElectricidad;
    }
    
    public Refrigerador(float tamaño, int numPuertas, String material, int consumoElectricidad, String marca, String modelo, String color, int precio) {
        super(marca, modelo, color, precio);
        this.tamaño = tamaño;
        this.numPuertas = numPuertas;
        this.material = material;
        this.consumoElectricidad = consumoElectricidad;
    }

    public int getConsumoElectricidad() {
        return consumoElectricidad;
    }

    public void setConsumoElectricidad(int consumoElectricidad) {
        this.consumoElectricidad = consumoElectricidad;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Refrigerador{" + "tama\u00f1o=" + tamaño + ", numPuertas=" + numPuertas + ","
                + " material=" + material + ", consumoElectricidad=" + consumoElectricidad + '}'+ super.toString();
    }
    
    public void consumo(){
        System.out.println("El consumo del refrigerador es de "+ this.consumoElectricidad + " KW Por Año");
    }
}
