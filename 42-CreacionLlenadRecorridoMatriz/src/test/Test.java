/*
    Crea una matriz de numeros de 3x3, pidiendo cada numero.
    Al final recorre la matriz y muestrala.
 */
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][] = new int [3] [3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Escribi un numero en la fila " + i + " y en la columna " + j + " :");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        //Mostrar matriz
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
