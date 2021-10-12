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
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c1 = new Coche();
        c1.setMatricula("7472 GXZ");//set para escribir
        c1.setMarca("Citröen");
        System.out.println("Los datos del coche 1 son: ");
        System.out.println(c1.getMatricula());//get para leer
        System.out.println(c1.getMarca());
        
        Coche c2 = new Coche("5412 ILO","Mercedes");
        Coche c3 = new Coche("6790 UWU","Opel");
        mostrarDetalles(c2);
        mostrarDetalles(c3);
        
    }
    public static void mostrarDetalles(Coche c){
        System.out.println("Los datos del coche son: ");
        System.out.println(c.getMatricula());
        System.out.println(c.getMarca());
    }
}
