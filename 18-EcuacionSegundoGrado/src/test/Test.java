/*
    Pide 3 numeros por consola y realiza una ecuacion de segundo grado.
 */
package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        do {
            System.out.print("Ingrese el valor de \"a\":");
            a = entrada.nextInt();
            if (a == 0) {
                System.out.println("Ingrese un numero distinto de 0");
            }
        } while (a == 0);

        System.out.print("Ingrese el valor de \"b\":");
        b = entrada.nextInt();

        System.out.print("Ingrese el valor de \"c\":");
        c = entrada.nextInt();
        
        double discriminante = (Math.pow(b, 2) - 4 * a * c);
        double x1, x2;
        
        if (discriminante > 0){
            System.out.println("Existen 2 posibles soluciones que son numeros reales distintos");
            x1 = (-b + Math.sqrt(discriminante) / (2 * a));
            x2 = (-b - Math.sqrt(discriminante) / (2 * a));
            System.out.println("Las soluciones son:" + x1 + " " + x2);
        }else if( discriminante == 0){
            x1 = -b / (2 * a);
            System.out.println("La ecuacion de segundo grado tiene una solucion doble:" + x1);
        }else 
            System.out.println("La ecuacion de segundo grado no tiene soluciones");
    }

}
