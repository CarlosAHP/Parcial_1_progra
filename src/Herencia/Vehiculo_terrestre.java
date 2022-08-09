/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Carlos Alfonso
 */
public class Vehiculo_terrestre extends Vehiculo{
    
    private int llantas;
    private String Volante;
    private String transmision; 
    
    public Vehiculo_terrestre(String color, String marca, String modelo, String cilindraje, String Tamano, String material, int llantas, String Volante, String transmision ){
    
    super(color, marca, modelo, cilindraje, Tamano, material);
    this.Volante = Volante;
    this.llantas = llantas; 
    this.transmision = transmision;
    
        
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getVolante() {
        return Volante;
    }

    public void setVolante(String Volante) {
        this.Volante = Volante;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }


}
