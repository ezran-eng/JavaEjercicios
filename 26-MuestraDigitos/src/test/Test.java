/*
    Crea un metodo dado un numero, muestre sus digitos.
 */
package test;

//Imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Ingreso
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingrese un numero:");
        numero = entrada.nextInt();
        
        System.out.println("Los digitos dentro del numero que ingreso son:");
        digitos(numero);
    }
    
    public static void digitos(int numero){
        final int DIVISOR = 10;
        for (int i = numero; i > 0; i /= DIVISOR) {
            System.out.print(i % DIVISOR + " ");
        }
    }
}
