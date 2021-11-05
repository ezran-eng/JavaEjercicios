/*
    Crea un array de numeros (Dale los valores tu mismo) e indica
    cual es la suma y la media de ese array.
 */
package test;

public class Test {
    public static void main(String[] args) {
        int numeros[] = {3, 5, 6};
        
        System.out.println("La suma de los numeros del arreglo es:" + devuelveSuma(numeros));
        System.out.println("La mitad de la suma del arreglo es:" + promedioArray(devuelveSuma(numeros), numeros));
    }
    
    public static double promedioArray(int suma, int[] array){
        return (double)suma / array.length;
    }
    
    public static int devuelveSuma(int [] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
    
    public static void mostrarArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " ");
        }
    }
}
