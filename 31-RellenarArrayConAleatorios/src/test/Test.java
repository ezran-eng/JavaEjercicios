/*
    Crea un array de 10 posiciones y rellenalo con numeros aleatorios.
    Muestralos al final.
    Crea una funcion para rellenarlo y otra para mostrar
*/
package test;
//imports
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
     
        //Declaracion de variables
        int minimo, maximo;
        int numerosAleatorios[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        
        //Ingreso del rango de los numeros aleatorios
        System.out.println("--RANGO NUMEROS ALEATORIOS--");
        System.out.print("Ingresa el valor minimo:");
        minimo = entrada.nextInt();
        System.out.print("Ingresa el valor maximo:");
        maximo = entrada.nextInt();
        
        //Uso de los procedimientos para el array
        rellenarArrayAleatorios(numerosAleatorios, minimo, maximo);
        mostrarArray(numerosAleatorios);
    }
    
    public static int generarNumeroAleatorio(int minimo, int maximo){
        if(minimo > maximo){
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }
        return (int) (Math.random() * (maximo - minimo +1) + (minimo));
    }
    
    public static void rellenarArrayAleatorios(int[] array,int minimo, int maximo){
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumeroAleatorio(minimo, maximo);
        }
    }
    
    public static void mostrarArray(int[] array){
        System.out.print("Los numeros del array son:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
