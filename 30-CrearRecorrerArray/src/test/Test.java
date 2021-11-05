/*
    Crea un array de 3 posiciones, rellenalo pidiendo los numeros al usuario
    y recorrelo para mostrarlo.
 */
package test;
//improts
//import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeros [] = new int [3];
        
        System.out.println("Insertando datos al array");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un numero en la posicion " + i + ":");
            numeros[i] = entrada.nextInt();
        }
        //Otra forma de mostrar los arrays
        //System.out.println(Arrays.toString(numeros));
        
        System.out.println("Mostrar array");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
    }
}
