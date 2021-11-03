/*
    Pide un salario base por consola y su puesto por consola.
    Calcula su sueldo sabiendo lo siguiente:
    
    Si es vendedor, cobra 500 euros mas.
    Si es director, cobra 1000 euros mas.
    Si es conserje, cobra 100 euros mas.

    Utiliza un enumerado para almacenar los tipos de puesto de trabajo.
    
*/
package test;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        //Toda la entrada
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        entrada.useLocale(Locale.US);
        
        //declaraciones de variables
        double salarioBase, salarioFinal = 0;
        String opc;
        boolean existe = false;
        
        //Ingreso de los dos datos
        System.out.print("Ingrese salario base:");
        salarioBase = entrada.nextDouble();
        
        System.out.print("Escribi el puesto que estas buscando:");
        opc = entrada.next().toUpperCase().trim();
        
        for(PuestoTrabajo p:PuestoTrabajo.values()) {
            if(opc.equals(p.name()))
                existe = true;
        }
        if (existe) {
            PuestoTrabajo p = PuestoTrabajo.valueOf(opc);
            
            switch(p) {
                case VENDEDOR:
                    salarioFinal = salarioBase + 500;
                    break;
                    
                case DIRECTOR:
                    salarioFinal = salarioBase + 1000;
                    break;
                    
                case CONSERJE:
                    salarioFinal = salarioBase + 100;
                    break;
            }
            
            System.out.println("El salario final del que quiere saber es:" + salarioFinal);
            
        }else 
            System.out.println("El puesto que ingreso no existe en nuestra base de datos ahre.");
    }
}
        