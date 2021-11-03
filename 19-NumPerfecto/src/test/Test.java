/*
    Pide un numero por consola e indica si es perfecto.
    Un numero perfecto es un numero natural que es igual a la 
    suma de sus divisores positivos.
    Por ejemplo, el 28 es un numero perfecto: 28 = 1 + 2 + 4 + 7 + 14
*/
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Declaracions de variables
        int numero, perfecto = 0, i = 1;
        
        //Declaracion del scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero cualquiera para comprobar si es perfecto:");
        numero = entrada.nextInt();
        
        while(i <= numero / 2){
            if(numero % i == 0)
                perfecto += i;
            i++;
        }
        if(perfecto == numero)
            System.out.println("El numero que ingreso es perfecto. " + perfecto);
        else
            System.out.println("El numero que ingreso no es perfecto." + perfecto);
    }
}
