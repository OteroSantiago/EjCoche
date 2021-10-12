/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcoche;

/**
 *
 * @author Santiago
 */
public class Coche {
    //atributos
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    //getters ands setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    //constructor vacio
    public Coche() {
        
    }
    //constructor con dos parametros

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }
    
    //constructor lleno
    public Coche(String matricula, String marca, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }
    
    
    
    
}
