/*
    Pide un numero por consola y valida que ese numero este entre 0 y 10.
    hacerlo con un do-while.
*/
package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Ingrese un numero entre 0 y 10:");
            numero = entrada.nextInt();
            
            if (!(numero >= 0 && numero <= 10))
                System.out.println("Tenes que ingresar un numero entre 0 y 10");
                
            
        } while (!(numero >= 0 && numero <= 10));
        System.out.println(numero + " esta en el rango");
        
    }
    
}
