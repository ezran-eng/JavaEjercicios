package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese primer numero:");
        int a = entrada.nextInt();
        
        System.out.print("\nIngrese segundo numero:");
        int b = entrada.nextInt();
        
        if (a == b)
            System.out.println("Los numeros son iguales.");
        else if (a > b) 
            System.out.println("El mayor numero es:" + a);
        else
            System.out.println("El mayor numero es:" + b);
        
    }
}
