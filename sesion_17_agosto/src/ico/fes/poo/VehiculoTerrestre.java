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
public class VehiculoTerrestre extends Vehiculo{
    private int tipo; //0: neumaticos, 1: vias ferreas, 2: magnetico
    private String kmPorHora;

    public VehiculoTerrestre() {
    }

    public VehiculoTerrestre(int tipo, String kmPorHora) {
        this.tipo = tipo;
        this.kmPorHora = kmPorHora;

    }

    public VehiculoTerrestre(int tipo, String kmPorHora, String descripcion, String fabricante, String material) {
        super(descripcion, fabricante, material); // super: hace referencia a la clase base en una relacion de herencia
        this.tipo = tipo;
        this.kmPorHora = kmPorHora;
    }

    public String getKmPorHora() {
        return kmPorHora;
    }

    public void setKmPorHora(String kmPorHora) {
        this.kmPorHora = kmPorHora;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "VehiculoTerrestre{" + "tipo=" + tipo + ", kmPorHora=" + 
                kmPorHora + '}' + super.toString();
    }
    
    public int viajar(){
        System.out.print("El vehiculo terrestre está viajando");
        
        switch(this.tipo){
            case 0:
                System.out.println("Carretera");
                
                break;
        case 1:
                System.out.println("Vías ferreas");
                
                break;
                case 2:
                System.out.println("Vías magnéticas");
                
                break;
                default: 
                    System.out.println("No reconocido");
        }
        return 0;
        
    }
    @Override //Polimorfismo: sobreescritura  de metodos
    public void usar(){
        System.out.println("Utilizando el Ferrocarril que viaja en vías férreas" + "de la marca " +this.getFabricante());
    }
}
