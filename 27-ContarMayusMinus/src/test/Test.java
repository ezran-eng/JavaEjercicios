/*
    Crea una funcion que dados dos parametros, siendo el primero un String
    y el segundo un boolean, cuente las letras minusculas o mayusculas,
    segun el valor del segundo parametro.
    
    tru = mayusculas, false=minusculas.
 */
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Entrada
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        //declaracion de variables
        String frase;
        boolean opcion;
        int opc;
        
        System.out.print("Ingrese la frase para contar palabras:");
        frase = entrada.next();
        do {
            System.out.print("Ingrese 1 contar mayusculas, Ingrese 2 contar minusculas:");
            opc = entrada.nextInt();
        } while (!(opc > 0 && opc < 3));
        if(opc == 1)
            opcion = true;
        else
            opcion = false;
        
        System.out.println(cuentaLetras(frase, opcion));
        
    }
    
    public static int cuentaLetras(String frase, boolean mayus){
        int min, max, contador = 0;
        
        if (mayus == true) {
            min = 65;
            max = 90;
        }
        else{
            min = 97;
            max = 122;
        }
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= min && frase.charAt(i) <= max) {
                contador++;
            }
        }
        return contador;
    }
}
