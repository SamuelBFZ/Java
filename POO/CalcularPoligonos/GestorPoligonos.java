package CalcularPoligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorPoligonos {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>(); //arreglo dinamico
    static Scanner scanner = new Scanner(System.in);

    public static void llenarPoligono(){
        char respuesta;
        int x = 0;
        do {


            do {
                System.out.println("Definir tipo de poligono a crear\n"+
                "1. Triangulo\n"+
                "2. Rectangulo");
                x = scanner.nextInt(); 
            } while (x<1 || x>2);

            switch (x) {
                case 1:
                    llenarTriangulo();
                    System.out.println("El Triangulo ha sido creado correctamente");
                    System.out.println("");
                    break;

                case 2:
                    llenarRectangulo();
                    System.out.println("El Rectangulo ha sido creado correctamente");
                    System.out.println("");
                    break;

                default:
                    break;
            }

            System.out.println("Introducir otro poligono?(s/n): ");
            respuesta = scanner.next().charAt(0);
            System.out.println("");

        } while (respuesta == 's' || respuesta == 'S');

        scanner.close();
    }

    public static void llenarTriangulo(){
        double lado1, lado2, lado3;

        System.out.println("digite el lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("digite el lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("digite el lado 3: ");
        lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        poligono.add(triangulo); //almaceno mi objeto dentro de mi arreglo dinamico
    }

    public static void llenarRectangulo(){
        double lado1, lado2;

        System.out.println("digite el lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("digite el lado 2: ");
        lado2 = scanner.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        poligono.add(rectangulo); //almaceno mi objeto dentro de mi arreglo dinamico
    }

    public static void mostrarPoligonos(){
        for (Poligono poli : poligono) {
            //dependiendo de que tipo de objeto es el poligono mostrara el toString correspondiente
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.area());
            System.out.println("");
        }
    }
}
