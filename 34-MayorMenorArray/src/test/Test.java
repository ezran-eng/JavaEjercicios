/*
    Mostrar el mayor y el menor de un array creado por ti mismo.
 */
package test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int array[] = {3 ,5 ,6 ,9 ,1 ,10};
        System.out.println("Mayor y menor de un array normal");
        mayorMenorArray(array);
        
        System.out.println("Mayor y menor de un array V2");
        mayorMenorArrayV2(array);
    }
    
    public static void mayorMenorArray(int[] array){
        int mayor = array[0], menor = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if(mayor < array[i])
                mayor = array[i];
            if(menor > array[i])
                menor = array[i];
        }
        System.out.println("El mayor del array es:" + mayor);
        System.out.println("El menor del array es:" + menor);
    }
    
    public static void mayorMenorArrayV2(int[] array){
        Arrays.sort(array);
        int menor = array[0];
        int mayor = array[array.length - 1];
        System.out.println("El mayor del array es:" + mayor);
        System.out.println("El menor del array es:" + menor);
    }
}
