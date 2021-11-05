/*
    Crea una funcion que genere una password aleatoriamente con letras 
    mayusculas, minusculas y numeros.
    Pasale por parametro la longitud del password
*/
package test;

//imports
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        //Entradas
        Scanner entrada = new Scanner(System.in);
        int tamanio;
        System.out.println("--Generador de Contraseñas--");
        System.out.print("Ingrese el tamaño deseado:");
        tamanio = entrada.nextInt();
        System.out.println("Su nueva contraseña es:" + generaPassword(tamanio));
    }
    
    public static int generaNumeroAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
    
    public static char generaMayusculaAleatoria(){
        return (char) generaNumeroAleatorio(65, 90);
    }
    
    public static char generaMinusculaAleatoria(){
        return (char) generaNumeroAleatorio(97, 122);
    }
    
    public static String generaPassword(int longitud){
        String password = "";
        int eleccion;
        
        for (int i = 0; i < longitud; i++) {
            eleccion = generaNumeroAleatorio(1, 3);
            
            switch(eleccion){
                case 1://numero
                    password += generaNumeroAleatorio(0, 9);
                    break;
                 
                case 2: //mayuscula
                    password  += generaMayusculaAleatoria();
                    break;
                  
                case 3: //minuscula
                    password += generaMinusculaAleatoria();
                    break;
            }
        }
        return password;
    }
}
