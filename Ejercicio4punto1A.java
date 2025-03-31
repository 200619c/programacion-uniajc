import java.util.Scanner;

public class Ejercicio4punto1A {

    public static void main(String[] args) {
        // Clase que me permita a traves del odjeto "leer" solicitar
        // datos por teclado
        Scanner leer = new Scanner(System.in);

        // Se declara la variable o las variables
        double angulo;

        // solicitar por teclado el angulo para so validacion
        System.out.print("Digite el ángulo: ");
        angulo = leer.nextInt();

        // se valida si el angulo ingresado es o no es un angulo recto
        if (angulo == 90) {
            System.out.println(" El ángulo es un ángulo recto");
        } else {
            System.out.println(" El ángulo NO es ángulo recto");
        }
        leer.close();
    }
}