/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2actividad2;

/**
 *
 * @author Lucas
 */
public class T2actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numero minumero;
        minumero = new numero();
        minumero.setValor(2); 
         System.out.println("el valor inial de nuestro numero es " + minumero.getValor());
         System.out.println(" Usando el metodo suma " + minumero.suma());
         System.out.println(" usando el metodo resta sobre la suma el numero es " + minumero.resta());
        
         System.out.println("Usando el metodo doble " + minumero.getDouble());
         System.out.println(" Usando el metodo triple " + minumero.getTriple());
    }
    
}
