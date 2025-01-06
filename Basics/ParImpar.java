import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        //Determinar por medio de condicionales si un numero digitado e par o impar

        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite el numero a examinar: ");
        numero = scanner.nextInt();

        if ((numero % 2) != 0) {
            System.out.println("El numero es impar");
        }else{
            System.out.println("El numero es par");
        }

        scanner.close();
    }
}
