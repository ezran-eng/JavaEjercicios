package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de segundos:");
        int segundos = entrada.nextInt();
        
        final int SEG_HOR = 3600;
        final int MIN_SEG = 60;
        
        int horas = segundos / SEG_HOR;
        int segSobra = segundos % SEG_HOR;
        int minutos = segSobra / MIN_SEG;
        segundos = segSobra % MIN_SEG;
        
        System.out.println("Horas:" + horas + "\nMinutos:" + minutos + "\nSegundos:" + segundos);
    }
    
}
