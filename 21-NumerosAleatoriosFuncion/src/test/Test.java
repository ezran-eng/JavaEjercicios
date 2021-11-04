package test;

public class Test {
    public static void main(String[] args) {
        int aleatorio = generaNumeroAleatorio(1, 10);
        System.out.println("El numero aleatorio que se genero es:" + aleatorio);
    }
    
    public static int generaNumeroAleatorio(int minimo, int maximo){
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
}
