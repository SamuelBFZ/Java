package CalcularPoligonos;

public class Main {    

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        
        GestorPoligonos.llenarPoligono();

        GestorPoligonos.mostrarPoligonos();

    }

}
