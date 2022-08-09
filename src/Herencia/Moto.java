/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Carlos Alfonso
 */
public class Moto extends Vehiculo_terrestre{
    
    private int  asiento_pasajero; 
    private  Float sitema_frenado;
    private String rin; 

    public Moto(int asiento_pasajero, Float sitema_frenado, String rin, String color, String marca, String modelo, String cilindraje, String Tamano, String material, int llantas, String Volante, String transmision) {
        super(color, marca, modelo, cilindraje, Tamano, material, llantas, Volante, transmision);
        this.asiento_pasajero = asiento_pasajero;
        this.sitema_frenado = sitema_frenado;
        this.rin = rin;
    }

    public int getAsiento_pasajero() {
        return asiento_pasajero;
    }

    public void setAsiento_pasajero(int asiento_pasajero) {
        this.asiento_pasajero = asiento_pasajero;
    }

    public Float getSitema_frenado() {
        return sitema_frenado;
    }

    public void setSitema_frenado(Float sitema_frenado) {
        this.sitema_frenado = sitema_frenado;
    }

    public String getRin() {
        return rin;
    }

    public void setRin(String rin) {
        this.rin = rin;
    }
    
    
}
