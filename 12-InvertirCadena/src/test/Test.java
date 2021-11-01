package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        System.out.print("Ingrese frase:");
        String cadena = entrada.next();
        
        String invertida = "";
        char caracter;
        for (int i = cadena.length()-1; i >= 0; i--) {
            caracter = cadena.charAt(i);
            invertida+=caracter;
        }
        System.out.println(invertida);
    }
}
