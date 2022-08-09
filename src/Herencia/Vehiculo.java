

package Herencia;


public class Vehiculo {
    
    private String color;
    private String marca;
    private String modelo;
    private String cilindraje;
    private String Tamano;
    private String material; 

    public Vehiculo(String color, String marca, String modelo, String cilindraje, String Tamano, String material) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.Tamano = Tamano;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public String getTamano() {
        return Tamano;
    }

    public String getMaterial() {
        return material;
    }
    
 
}
