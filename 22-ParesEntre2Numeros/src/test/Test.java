/*
    crea un metodo que dados dos numeros muestre los pares 
    que hay entre esos dos numeros
*/
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Declaracion de la entrada de datos
        Scanner entrada = new Scanner(System.in);
        
        //Declaracion de variables
        int inicio, fin;
        
        System.out.print("Ingresa el numero inicial:");
        inicio = entrada.nextInt();
        
        System.out.print("Ingresa el numero final:");
        fin = entrada.nextInt();
        
        paresEntre(inicio, fin);
    }
    
    public static void paresEntre(int inicio, int fin){
        if(inicio > fin){
            int aux = fin;
                fin = inicio;
                inicio = aux;
        }
            for (int i = inicio; i <= fin; i++) {
            if(i % 2 == 0)
                System.out.println(i);
            }
    }
}
