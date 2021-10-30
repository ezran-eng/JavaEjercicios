/*
    Mostrar los numeros pares que hay entre el 1 y el 10.
*/
package test;

//Imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Usando un ciclo for:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) 
                System.out.println("El " + i + " es par");
        }
        
        System.out.println("Usando un ciclo While:");
        int j = 1;
        while(j <= 10){
            if(j % 2 == 0)
                System.out.println("El " + j + " es par");
            j++;
        }
    }
}
