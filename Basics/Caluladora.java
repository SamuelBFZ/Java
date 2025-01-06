import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);//Objeto que me permitira leer variables

        int x = 0;
        int num1 = 0;
        int num2 = 0;
        int resultado = 0; 

        System.out.println(
            "Bienvenido al menu de opciones, escoja una opcion: \n" +
            "opcion 1: Sumar\n" +
            "opcion 2: Restar\n" +
            "opcion 3: Multiplicar\n" +
            "opcion 4: Dividir\n"
        );
        x = scanner.nextInt();

        System.out.println("Escribir primer numero: ");
        num1 = scanner.nextInt();

        System.out.println("Escribir segundo numero: ");
        num2 = scanner.nextInt();

        switch (x) {
            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                resultado = num1 / num2;
                break;

            default:
                System.out.println("utilice una opcion dentro del menu.");
                break;
        }
        System.out.println("El resultado de la operacion es: " + resultado);

        scanner.close();// cerrar el objeto
    }
}
