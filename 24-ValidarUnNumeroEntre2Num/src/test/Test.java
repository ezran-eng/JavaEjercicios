/*
    Crea una funcion que valide un numero entre dos numeros.
    Necesitas dos parametros numericos.
 */
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //entrada de datos
        Scanner entrada = new Scanner(System.in);
        int minimo, maximo, dentro;
        
        System.out.print("Ingrese valor minimo:");
        minimo = entrada.nextInt();
        
        System.out.print("Ingrese valor maximo:");
        maximo = entrada.nextInt();
        
        dentro = validaNumero(minimo, maximo);
        
        System.out.println(dentro + " Esta dentro del rango.");
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
}
