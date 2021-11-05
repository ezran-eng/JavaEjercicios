/*
    Crea una funcion, que dado un numero muestre cual es el digito mas alto
    que tiene.
 */
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //declaraciones de variables
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.print("Ingrese un numero:");
        num = entrada.nextInt();
        
        System.out.println("El digito mas grande es:" + digMasAlto(num));
    }
    
    public static int digMasAlto(int numero){
        final int DIVISOR = 10;
        int mayor = 0;
        for (int i = numero; i > 0; i /= DIVISOR) {
            if (mayor < i % DIVISOR)
                mayor = i % DIVISOR;
        }
        return mayor;
    }
}
