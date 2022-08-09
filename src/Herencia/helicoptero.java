/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Carlos Alfonso
 */
public class helicoptero extends Vehiculo_aereo {
    
    private String  rotor;
    private String aleta;
    private String establizador; 
    private String conducto_entrada;
    private String cubo_rotor;
    private String paleta; 

    public helicoptero(String rotor, String aleta, String establizador, String conducto_entrada, String cubo_rotor, String paleta, int grupo_motorpropulsor, int puertas, String tren_aterrizaje, String timon, String color, String marca, String modelo, String cilindraje, String Tamano, String material) {
        super(grupo_motorpropulsor, puertas, tren_aterrizaje, timon, color, marca, modelo, cilindraje, Tamano, material);
        this.rotor = rotor;
        this.aleta = aleta;
        this.establizador = establizador;
        this.conducto_entrada = conducto_entrada;
        this.cubo_rotor = cubo_rotor;
        this.paleta = paleta;
    }

    public String getRotor() {
        return rotor;
    }

    public void setRotor(String rotor) {
        this.rotor = rotor;
    }

    public String getAleta() {
        return aleta;
    }

    public void setAleta(String aleta) {
        this.aleta = aleta;
    }

    public String getEstablizador() {
        return establizador;
    }

    public void setEstablizador(String establizador) {
        this.establizador = establizador;
    }

    public String getConducto_entrada() {
        return conducto_entrada;
    }

    public void setConducto_entrada(String conducto_entrada) {
        this.conducto_entrada = conducto_entrada;
    }

    public String getCubo_rotor() {
        return cubo_rotor;
    }

    public void setCubo_rotor(String cubo_rotor) {
        this.cubo_rotor = cubo_rotor;
    }

    public String getPaleta() {
        return paleta;
    }

    public void setPaleta(String paleta) {
        this.paleta = paleta;
    }
    
    
    
}
