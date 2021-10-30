/*
    Pedir palabras al usuario hasta que el usuario escriba una cadena vacia.
    Muestra la concatenacion de esas palabras al final.
*/
package test;

//Imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        System.out.print("Ingresa una cadena:");
        String cadena = entrada.next();
        
        String concatenar = "";
        
        while(!cadena.isEmpty()){
            concatenar += cadena;
            
        System.out.print("\nIngresa una cadena:");
        cadena = entrada.next();
        }
        System.out.println(concatenar);
    }
    
}
