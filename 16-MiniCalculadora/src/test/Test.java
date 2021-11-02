/*
    Pide dos numeros por teclado y crea un pequeño menu
    con las siguientes opciones:
    1- sumar
    2- restar
    3- dividir
    4- multiplicar
    5- modulo
    
    Al final debemos preguntar si queremos realizar una operacion mas
    en caso afirmativo volver a empezar.
*/
package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc = 0, num1, num2;
        System.out.print("Ingrese primer numero:");
        num1 = entrada.nextInt();
        System.out.print("\nIngrese el segundo numero:");
        num2 = entrada.nextInt();
        
        
        do {
            System.out.println("1-suma\n2-resta\n3-division\n4-multiplicacion\n5-modulo\n0-salir");
            
           try {
            System.out.print("Ingrese una opcion:");
            opc = entrada.nextInt();
            } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un numero");
            entrada.next();
        }
            
            switch (opc){
                case 1://Suma
                    int suma = num1 + num2;
                    System.out.println("El resultado de la suma es:" + suma);
                    break;
                
                case 2://resta
                    int resta = num1 - num2;
                    System.out.println("El resultado de la resta es:" + resta);
                    break;
                
                case 3://division
                    double div =  (double)num1 / num2;
                    System.out.println("El resultado de la division es:" + div);
                    break;
                 
                case 4://multiplicacion
                    int mult = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es:" + mult);
                    break;
                 
                case 5://modulo
                    int mod = num1 % num2;
                    System.out.println("El resultado del modulo es:" + mod);
                    break;
                 
                case 0://salir
                    System.out.println("PROGRAMA CERRAD CON EXITO");
                    break;
                
                default:
                    System.out.println("Ingresa una opcion valida");
                    break;
            }                

             
        } while (opc != 0);
        

}
}
