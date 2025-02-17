import java.util.Scanner;

public class Convertidor {

    public static void main(String[] args) {
        // Declaracion de las variables para el ejercicio
        // c-> grados celsius, f -> grados farenheit
        double c, f, gradoscelcius, gradosfarenheit;
        
        //pedir datos por teclado
        Scanner leer = new Scanner (System. in);
        System.out.println("Digite los grados celcius");
        c = leer.nextDouble();
        System.out.println("digite los grados farenheit");
        f = leer.nextDouble();

        gradoscelcius = (f - 32.0) * (5.0/9.0);
        gradosfarenheit = c * (9.0/5.0) + 32.0;
        // Mostrar ls resultados de las formulas
        System.out.println("ºF -> ºC : " + gradoscelcius);
        System.out.println("ºC -> ºF : " + gradosfarenheit);
        leer.close();


    }
}