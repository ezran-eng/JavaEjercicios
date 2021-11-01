/*
    Pide a un numero real que represente a un precio y muestra el precio con IVA.
    El IVA es de 21%.
*/

package test;

//imports
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        final double IVA = 0.21;
        
        System.out.print("Ingrese un precio:");
        double precioSinIVA = entrada.nextDouble();
        
        //double precioConIVA = precioSinIVA + (precioSinIVA * IVA);
        double precioConIVA = precioSinIVA * (1 + IVA);
        
        System.out.println(precioConIVA);
        
    }
    
}
