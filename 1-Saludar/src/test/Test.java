
package test;

import java.util.Scanner;



public class Test {
    
    //Principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        System.out.print("Ingrese nombre:");
        String nombre = entrada.next();
        
        System.out.println("Holaa " + nombre + "!!");
    }
}
