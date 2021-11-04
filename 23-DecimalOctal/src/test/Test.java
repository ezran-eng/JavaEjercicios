/*
    Crea una funcion que dandole un numero decimal lo convierta a octal.
    Por ejemplo: 123 = 1 * 10 elevado 2 + 7 * 10 elevado 1 + 3 * 10 elevado 0
 */
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //entrada de datos
        Scanner entrada = new Scanner(System.in);
        //declaracion de datos
        int decimal;
        
        System.out.print("Ingrese numero a convertir:");
        decimal = entrada.nextInt();
        System.out.println("El numero convertido a octal es:" + decimalOctal(decimal));
    }
    
    public static int decimalOctal(int decimal){
        int octal = 0, digito;
        final int DIVISOR = 8;
        
        for (int i = decimal, j = 0; i > 0; i /= DIVISOR, j++) {
             digito = i % DIVISOR;
             octal += digito * Math.pow(10, j);
        }
        return octal;
    }
}
