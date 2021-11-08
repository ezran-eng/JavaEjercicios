/*
    Tendremos un array con palabras que tu elijas, creala vos mismo.
    Debes mostrar la palabra elejida con guiones e ir pidiendo letras.
    El usuario gana cuando la palabra este completa.
    Si falla 6 veces, el usuario pierde.
 */
package test;

//imports
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        final int NUM_FALLOS_MAX = 6;
        
        Scanner entrada = new Scanner(System.in);
        final String PALABRAS[] = {"chiste", "elefante", "alberto", "coche", "llaves", "naranja"};
        
        String palabraAdivinar = PALABRAS[generarNumeroAleatorio(0, PALABRAS.length - 1)];
        char caracteres[] = palabraAdivinar.toCharArray();
        boolean acertados[] = new boolean[caracteres.length];
        int numeroFallos = 0;
        char caracter;
        
        while(!palabraAcertada(acertados) && numeroFallos < NUM_FALLOS_MAX){
            mostrarCaracteres(caracteres, acertados);
            System.out.print("Escribe una letra:");
            caracter = entrada.next().toLowerCase().charAt(0);
            if(revelarCaracteres(caracter, caracteres, acertados) > 0)
                System.out.println("Has acertado con el caracter");
            else{
                numeroFallos++;
                if(numeroFallos < NUM_FALLOS_MAX)
                    System.out.println("Has fallado, te quedan " + (NUM_FALLOS_MAX - numeroFallos) + " fallos");
            }
        }
        
        if(palabraAcertada(acertados))
            System.out.println("Has ganado");
        else
            System.out.println("Has perdido");
        
        mostrarCaracteres(caracteres, acertados);
    }
    
    public static int generarNumeroAleatorio(int minimo, int maximo){
        return (int)(Math.random() * (maximo - minimo + 1) + (minimo));
    }
    
    public static void mostrarCaracteres(char [] caracteres, boolean[] acertados){
        for (int i = 0; i < caracteres.length; i++) {
            if (acertados[i])
                System.out.print(caracteres[i] + " ");
            else
                System.out.print("_ ");
        }
        System.out.println("");
    }
    
    public static boolean palabraAcertada(boolean[] acertados){
        for (int i = 0; i < acertados.length; i++) {
            if(!acertados[i])
                return false;
        }
        return true;
    }
    
    public static int revelarCaracteres(char caracter, char[] caracteres,  boolean[] acertados){
        int acertadas = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == caracter){
                acertados[i] = true;
                acertadas++;
            }
        }
        return acertadas;
    }
}
