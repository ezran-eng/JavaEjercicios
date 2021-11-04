/*
    Crea una funcion que indique si una frase o palabra pasada por parametros
    es un palindromo. Usa las funciones adicionlaes que concideres necesarias.
 */
package test;

//imports
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        //Declaraciones
        Scanner entrada = new Scanner(System.in);
        String cadena;
        
        System.out.print("Ingresa una cadena:");
        cadena = entrada.next();
        System.out.println("La cadena es palindromo?:" + palindromo(cadena));
    }
    
    public static boolean palindromo(String palabra){
        String invertido = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertido += palabra.charAt(i);
        }
        return palabra.equals(invertido);
    }
}
