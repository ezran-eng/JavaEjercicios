/*
    Pide una frase por consola y guarda en un array todos sus caracteres.
 */
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        System.out.print("Escribe una frase:");
        String frase = entrada.next();
        
        /* 1 - Primera forma*/
//        char caracteres[] = new char[frase.length()];
//        
//        for (int i = 0; i < caracteres.length; i++) {
//            caracteres[i] = frase.charAt(i);
//        }
//        mostrarArray(caracteres);
        
        /* 2 - Segunda forma*/
        char caracteres[] = frase.toCharArray();
        mostrarArray(caracteres);
    }
    
    public static void mostrarArray(char [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
