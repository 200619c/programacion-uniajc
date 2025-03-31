import java.util.Scanner;

public class Ejercicio4punto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero:");
        int nume1 = sc.nextInt();
        System.out.println("Ingresa el egundo numero: ");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.err.println("El primer numero es el mayor. ");

        } else if (num1 < num2){
            System.out.println("El peimer numero es el mas pequeño.");

        } else {
            System.out.println( "Ambos numeros son iguales." );
        }
    }
    
}
