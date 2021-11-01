/*
    Generar un numero aleatorio entre 1 y 100.
    Pedir al usuario numeros que esten dentro de este rango.
    Si el usuario falla indicarle si el numero que ingreso es mayor o es menor.
    El programa termina cuando el usuario acerta. No hay limite de intentos.
*/
package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        final int maximo = 100;
        final int minimo = 1;
        
        Scanner entrada = new Scanner(System.in);
        int numero, numRan = (int)(Math.random() * (maximo - minimo + 1) + (minimo));
        
        do {
            System.out.print("Ingrese un numero:");
            numero = entrada.nextInt();
            if (numero > numRan)
                System.out.println("El numero que ingreso es mayor");
            else if(numero < numRan)
                System.out.println("El numero que ingreso es menor");
                
        } while (numero != numRan);
        System.out.println("Acertastee!! el numero que ingreso:" + numero + "\nEs igual al numero generado aleatoriamente:" + numRan);
    }
    
}
