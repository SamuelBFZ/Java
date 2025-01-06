package Automovil;

import java.util.Scanner;

public class Main {

    //metodo para el precio menor del arreglo vehiculo
    public static int automovilBarato(Automovil automovil[]){
        float precio;
        int indice = 0;                                     //definimos un indice para recorrer el vector
        precio = automovil[0].getPrecio();                  //obtenemos el precio del vehiculo
        for (int i = 1; i < automovil.length; i++) {        //empezamos desde la posicion 1 porque ya tenemos el valor de 0
            if (automovil[i].getPrecio() < precio) {        //condicional que compara si el precio del automovil nuevo es menor a el precio que ya tenemos
                precio = automovil[i].getPrecio();          //guardamos el precio mayor en precio
                indice = i;                                 //definimos el nuevo indice
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        String marca, modelo;
        int nAutomoviles, indice;
        float precio;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad de vehiculos a revisar: ");
        nAutomoviles = scanner.nextInt();

        Automovil automovil[] = new Automovil[nAutomoviles]; //con esto defino que el vector de automoviles sea del tamaño al que digito el usuario

        //bucle para digitar atributos del automovil
        for (int i = 0; i < automovil.length; i++) {
            scanner.nextLine();
            System.out.println("Digite las caracteristicas del automovil numero "+(i+1)+":");
            System.out.println("Digite la marca del veiculo: ");
            marca = scanner.nextLine();
            System.out.println("Digite el modelo del veiculo: ");
            modelo = scanner.nextLine();
            System.out.println("Digite el precio del veiculo: ");
            precio = scanner.nextFloat();

            automovil[i] = new Automovil(marca, modelo, precio);
        }

        indice = automovilBarato(automovil);
        System.out.println("El precio menor pertenece el automovil: \n"+ automovil[indice].mostrarDatos());

        scanner.close();
    }
}
