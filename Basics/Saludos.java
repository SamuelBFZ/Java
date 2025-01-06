import java.time.LocalTime;

public class Saludos {
    public static void main(String[] args) {
        //Segun la hora, saludar al usuario con buenos dias, tarde o noches

        System.out.println("\033[H\033[2J");
        System.out.flush();
        
        LocalTime localTime = LocalTime.now();//Obtengo hora del computador

        LocalTime inicioManana = LocalTime.of(6, 0, 0);//Con localtime.of puedo definir las variables de hora, minuto y segundo
        LocalTime finManana = LocalTime.of(12, 0, 0);
        LocalTime inicioTarde = LocalTime.of(12, 1, 0);
        LocalTime finTarde = LocalTime.of(17, 0, 0);

        //Si la hora actual es diferente al tiempo anterior de inicio mañana y diferente al timepo mayor de fin mañana entonces son buenos dias
        if (!localTime.isBefore(inicioManana)  && !localTime.isAfter(finManana)){
            System.out.println("Buenos dias");
        //Lo mismo para la tarde    
        }else if (!localTime.isBefore(inicioTarde)  && !localTime.isAfter(finTarde)){
            System.out.println("Buenas tardes");
        //Y si no es de ninguno de los dos entonces es de noche    
        }else{
            System.out.println("buenas noches");
        }
    }
}
