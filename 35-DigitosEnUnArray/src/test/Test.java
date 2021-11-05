/*
    Crea una funcion que dado un numero natural me devuelve sus digitos
    en un array.
 */
package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int numero = validaNumero(0, Integer.MAX_VALUE);
        int numeros[] = digitosNumeroArray(numero);
        mostrarArray(numeros);
    }
    
    public static int validaNumero(int minimo, int maximo){
        //entrada de datos
        Scanner entrada = new Scanner(System.in);
        int num;
        
        if(minimo > maximo){
            int aux = maximo;
            maximo = minimo;
            minimo = aux;
        }
        
        do {
            System.out.print("Ingrese un numero piola:");
            num = entrada.nextInt();
            if (!(num >= minimo && num <= maximo))
                System.out.println("Ingresa un numero dentro del rango");
            
        } while (!(num >= minimo && num <= maximo));
        
        return num;
    }
    
    public static int cuentaCifras(int num) {
        int contador = 0;
        if (num == 0)
            contador = 1;
        else {
            for (int i = Math.abs(num); i > 0; i /= 10) {
                contador++;
            }
        }
        return contador;
    }
    
    public static int[] digitosNumeroArray(int numero){
        final int DIVISOR = 10;
        int digitos [] = new int[cuentaCifras(numero)];
        
        //De derecha a izquierda
        //for (int i = numero, j = 0; i > 0; i /= DIVISOR, j++) {
        //    digitos[j] = i % DIVISOR;
        //}
        //De izquierda a derecha
        for (int i = numero, j = cuentaCifras(numero) - 1; i > 0; i /= DIVISOR, j--) {
            digitos[j] = i % DIVISOR;
        }
        
        return digitos;
    }
    
    public static void mostrarArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
