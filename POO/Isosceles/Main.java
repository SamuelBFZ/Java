package Isosceles;

import java.util.Scanner;


public class Main {

    public static double mayorSuperficie(Triangulo vTriangulo[]){
        double area = vTriangulo[0].getArea();
        for (int i = 1; i > vTriangulo.length; i++) {
            if (vTriangulo[i].getArea() > area) {
                area = vTriangulo[i].getArea();
            }
        }
        return area;
    }
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);

        Double lado, base;
        int x, nTriangulos;

        System.out.println(
            "Bienvenido al menu de opciones, escoja una opcion: \n" +
            "opcion 1: calcular para un triangulo\n" +
            "opcion 2: calcular para un conjunto de triangulos\n"
        );

        x = scanner.nextInt();

        switch (x) {
            case 1:
                scanner.nextLine();
                System.out.println("Digite la medida de un lado del triangulo: ");
                lado = scanner.nextDouble();
                System.out.println("Digite la medida de la base del triangulo: ");
                base = scanner.nextDouble();

                Triangulo triangulo = new Triangulo(lado, base);

                System.out.println("el area del triangulo es: "+triangulo.getArea());
                System.out.println("el perimetro del triangulo es: "+triangulo.getPerimetro());
                break;
        
            case 2:
                System.out.println("Digite la cantidad de triangulos a revisar: ");
                nTriangulos = scanner.nextInt();

                Triangulo vTriangulo[] = new Triangulo[nTriangulos]; 

                for (int i = 0; i < vTriangulo.length; i++) {
                    scanner.nextLine();
                    System.out.println("Digite los datos del triangulo "+(i+1)+":");
                    System.out.println("Digite la medida de un lado del triangulo: ");
                    lado = scanner.nextDouble();
                    System.out.println("Digite la medida de la base del triangulo: ");
                    base = scanner.nextDouble();

                    vTriangulo[i] = new Triangulo(lado, base);
                }

                System.out.println("El area del triangulo con mayor superficie es: "+mayorSuperficie(vTriangulo));//no es necesario indice ya que solo devolvemos el mayor
                break;
            default:
                System.out.println("Digite un valor entre el menu.");
                break;
        }

        scanner.close();
    }
}
