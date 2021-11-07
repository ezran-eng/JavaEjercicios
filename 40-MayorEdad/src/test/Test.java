/*
    Teniendo un array de Strings con el nombre de personas y otros de numeros
    con su edad, indicar quien es la persona mas mayor.
 */
package test;

public class Test {
    public static void main(String[] args) {
        String [] nombres = {"Fernando", "Alberto", "Jaime", "Pepito"};
        int [] edades = {28, 31, 20, 40};
        
        int mayor = edades[0];
        int posicionMayor = 0;
        
        for (int i = 0; i < edades.length; i++) {
            if (mayor < edades[i]) {
                mayor = edades[i];
                posicionMayor = i;
            }
        }
        System.out.println("La persona mayor es: " + nombres[posicionMayor] + " con una edad de " + edades[posicionMayor] + " años.");
        
    }
}
