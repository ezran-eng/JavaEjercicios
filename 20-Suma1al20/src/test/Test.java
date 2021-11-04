/*
    Crear una funcion que me devuelva la suma del 1 al numero pasado por
    parametro (este incluido)
*/
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño:");
        int tam = entrada.nextInt();
        
        int suma = sumaN(tam);
        System.out.println("El resultado de la suma es:" + suma);
    }
    
    public static int sumaN(int tam){
        int sum = 0;
        for (int i = 0; i <= tam; i++) {
            sum += i;
        }
        return sum;
    }
}
