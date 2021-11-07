/*
    Dado un array de numeros, indica cual es el elemento mas repetido,
    en caso de empate, mostrar el ultimo mas repetido.
 */
package test;

public class Test {
    public static void main(String[] args) {
        int a [] = {1,1,4,3,1,2,4,1,1,6,5,5,3};
        
        int contador = 0;
        int mayor = 0;
        int mayorRepeticiones = 0;
        int numeroBuscado;//Primer bucle
        int numeroActual;//bucle anidado
        
        for (int i = 0; i < a.length; i++) {
            numeroBuscado = a[i];
            contador = 0;
            for (int j = 0; j < a.length; j++) {
                numeroActual = a[j];
                if (numeroBuscado == numeroActual) {
                    contador++;
                }
            }
            if (contador >= mayorRepeticiones) {
                mayor = numeroBuscado;
                mayorRepeticiones = contador;
            }
        }
        System.out.println("El numero mas repetido es:" + mayor + " con " + mayorRepeticiones + " repeticiones");
    }
}
