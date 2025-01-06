class HolaMundo{
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();


        //Ciclo de todos los numeros impares hasta el 100
        for (int i = 0; i <= 100; i++) {
            if ((i%2) != 0 ) {// % devuelve el residuo
                System.out.println(i);
            }
        }

        //Serie de fibonacci (La suma del numero anterior mas el que le sigue)
        int x = 1;//Empezamos por el 1
        int anterior = 0; //Guardamos el numero anterior de cada numero
        int temporal; //Para guardar el numero
        
        while (true) {
            System.out.println(x);
            temporal = x; //definimos que temporal es x de una vez antes de cambiarla
            x = x + anterior; //sumamos x mas el anterior
            anterior = temporal; //definimos anterior como el numero que era x
            if (x > 30) {
                break;
            }
        }
    }
}
