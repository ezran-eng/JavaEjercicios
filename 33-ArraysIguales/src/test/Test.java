/*
    Crea dos arrays e indica si son iguales.
 */
package test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3};
        int a2[] = {1, 2, 3};
        
        if(Arrays.equals(a1, a2))
            System.out.println("Los arrays son iguales");
        else 
            System.out.println("Los arrays no son iguales");
    }
}
