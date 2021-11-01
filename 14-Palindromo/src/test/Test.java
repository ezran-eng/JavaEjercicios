/*
    Pide una frase por consola e indica si es palindromo.
    Es palindromo cuando se lee una frase igual de izquierda a derecha
    que de derecha a izquierda.
*/
package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        String palabra, invertido = "";
        System.out.print("Ingrese frase o palabra:");
        palabra = entrada.next();
        
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertido += palabra.charAt(i);
        }
        
        if(palabra.equals(invertido))
        System.out.println("La palabra:" + invertido + " si es Palindroma");
        else
            System.out.println("La palabra no es Palindroma");
    }
}
