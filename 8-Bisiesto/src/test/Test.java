/*
    Pide un año por teclado (número) e indica si es bisiesto o no.
    Es bisiesto cuando es divisible entre 4 y no divisible entre 100 o si es
    divisible entre 400.
*/
package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un anio:");
        int anio = entrada.nextInt();
        if(anio % 400 == 0) 
            System.out.println("Es bisiesto");
        else
            System.out.println("no es bisiesto");
    }
    
}
