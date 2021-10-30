/*
    Pedir un numero por consola y mostrar la tabla del 10
*/
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un numero:");
        int num = entrada.nextInt();
        
        System.out.println("Mostrando tabla del " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.print(num + " x " + i + " = ");
            System.out.println(num * i);
        }
    }
}
