/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Carlos Alfonso
 */
public class Automovil extends Vehiculo_terrestre {
    
    private int retrovisor;

    public Automovil(int retrovisor, String color, String marca, String modelo, String cilindraje, String Tamano, String material, int llantas, String Volante, String transmision) {
        super(color, marca, modelo, cilindraje, Tamano, material, llantas, Volante, transmision);
        this.retrovisor = retrovisor;
    }

    public int getRetrovisor() {
        return retrovisor;
    }

    public void setRetrovisor(int retrovisor) {
        this.retrovisor = retrovisor;
    }
   
    
}
