/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradadatosjava;
import java.util.Scanner;

/**
 *
 * @author mauramz
 */
public class EntradaDatosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese su Nombre: ");
       String nombre = leer.nextLine();
       
        System.out.println("Ingrese su Edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese un caracter: ");
        char c= leer.next().charAt(0);
        
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Caracter: "+c);
    }
    
}
