import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        //Realizar un convertidor de grados celcius a farenheit.
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        int celsius = 0;
        double farenheit = 0;

        System.out.println("Digite la cantidad de grados celsius: ");
        celsius = scanner.nextInt();

        farenheit = (celsius * 1.8) + 32;
        System.out.println("La cantidad en farenheit es: " + farenheit);

        scanner.close();
    }
}
