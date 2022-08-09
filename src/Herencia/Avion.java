/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Carlos Alfonso
 */
public class Avion extends Vehiculo_aereo {
        private String  aleron;
        private String tren_de_nariz;
        private int alaron; 
       private String  flap; 
       private String  timones_G;
       private String empenaje_cola;

    public Avion(String aleron, String tren_de_nariz, int alaron, String flap, String timones_G, String empenaje_cola, int grupo_motorpropulsor, int puertas, String tren_aterrizaje, String timon, String color, String marca, String modelo, String cilindraje, String Tamano, String material) {
        super(grupo_motorpropulsor, puertas, tren_aterrizaje, timon, color, marca, modelo, cilindraje, Tamano, material);
        this.aleron = aleron;
        this.tren_de_nariz = tren_de_nariz;
        this.alaron = alaron;
        this.flap = flap;
        this.timones_G = timones_G;
        this.empenaje_cola = empenaje_cola;
    }

    public String getAleron() {
        return aleron;
    }

    public void setAleron(String aleron) {
        this.aleron = aleron;
    }

    public String getTren_de_nariz() {
        return tren_de_nariz;
    }

    public void setTren_de_nariz(String tren_de_nariz) {
        this.tren_de_nariz = tren_de_nariz;
    }

    public int getAlaron() {
        return alaron;
    }

    public void setAlaron(int alaron) {
        this.alaron = alaron;
    }

    public String getFlap() {
        return flap;
    }

    public void setFlap(String flap) {
        this.flap = flap;
    }

    public String getTimones_G() {
        return timones_G;
    }

    public void setTimones_G(String timones_G) {
        this.timones_G = timones_G;
    }

    public String getEmpenaje_cola() {
        return empenaje_cola;
    }

    public void setEmpenaje_cola(String empenaje_cola) {
        this.empenaje_cola = empenaje_cola;
    }
        
    
}
