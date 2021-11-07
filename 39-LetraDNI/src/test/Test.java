/*
    Dado un array de caracteres (me lo dan) y tu numero de DNI, 
debes scacar la letra de tu DNI.
    Para obtenerla solo deber sacar el modulo de 23 y ese sera el
indice del array.
 */
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        System.out.print("Escribe tu numero de DNI:");
        int dni = entrada.nextInt();
        
        final int DIVISOR = 23;
        
        int indiceLetra = dni % DIVISOR;
        
        System.out.println(dni + " " + letrasNIF[indiceLetra]);
    }
    
}
