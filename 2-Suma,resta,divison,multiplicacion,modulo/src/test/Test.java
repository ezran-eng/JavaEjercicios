package test;

import java.util.Scanner;
        
public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese primer numero:");
        int a = entrada.nextInt();
        
        System.out.print("\nIngrese el segundo numero:");
        int b = entrada.nextInt();
        
        System.out.println("El resultado de la suma es:" + (a + b));
        System.out.println("El resultado de la resta es:" + (a - b));
        System.out.println("El resultado de la multiplicacion es:" + (a * b));
        
        if (b == 0){
            System.out.println("No puedes dividir entre 0");
        }else{
        double div = (double)a / b;
        System.out.println("El resultado de la division es:" + div);
        }
        
    }
}
