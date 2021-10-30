/*
    Pide una cadena por consola y muestra sus caracteres uno a uno.
*/
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        System.out.print("Ingrese una frase o palabara:");
        String frase = entrada.next();
        
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i); //charAt devuelve un caracter que se encuentre en i posicion
            System.out.println(caracter);
        }
    }
    
}
