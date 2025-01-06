package Package;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        
        Cuadrilatero cuadrilatero;
        float lado1, lado2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el lado 1: ");
        lado1 = scanner.nextFloat();
        
        System.out.println("Digite el lado 2: ");
        lado2 = scanner.nextFloat();

        if (lado1 == lado2) {
            System.out.println("Es un cuadrado!!");
            cuadrilatero = new Cuadrilatero(lado1);
        }else{
            System.out.println("No es un cuadrado!!");
            cuadrilatero = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro de la figura es "+ cuadrilatero.getPermietro());
        System.out.println("El area de la figura es "+ cuadrilatero.getArea());    

        scanner.close();
    }
}
