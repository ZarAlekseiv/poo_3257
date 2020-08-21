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
public class Electrodomestico {
    private String marca;
    private String modelo;
    private String color;
    private int precio;

    public Electrodomestico() {
    }

    public Electrodomestico(String marca, String modelo, String color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + '}' ;
    }
    
    public void sugerir(){
        System.out.println("Se sugiere el electrodomestico de la marca "+ this.marca);
    
    }
}
