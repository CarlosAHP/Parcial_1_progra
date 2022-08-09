/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Carlos Alfonso
 */
public class Vehiculo_aereo extends Vehiculo{
    
    private int grupo_motorpropulsor; 
    private int puertas; 
    private String tren_aterrizaje;
    private String timon;

    public Vehiculo_aereo(int grupo_motorpropulsor, int puertas, String tren_aterrizaje, String timon, String color, String marca, String modelo, String cilindraje, String Tamano, String material) {
        super(color, marca, modelo, cilindraje, Tamano, material);
        this.grupo_motorpropulsor = grupo_motorpropulsor;
        this.puertas = puertas;
        this.tren_aterrizaje = tren_aterrizaje;
        this.timon = timon;
    }

    public int getGrupo_motorpropulsor() {
        return grupo_motorpropulsor;
    }

    public void setGrupo_motorpropulsor(int grupo_motorpropulsor) {
        this.grupo_motorpropulsor = grupo_motorpropulsor;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTren_aterrizaje() {
        return tren_aterrizaje;
    }

    public void setTren_aterrizaje(String tren_aterrizaje) {
        this.tren_aterrizaje = tren_aterrizaje;
    }

    public String getTimon() {
        return timon;
    }

    public void setTimon(String timon) {
        this.timon = timon;
    }
  
    
}
