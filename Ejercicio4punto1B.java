import java.util.Scanner;

public class Ejercicio4punto1B {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double temperatura = 0.0;
        System.out.print("Digite temperatura: ");
        temperatura = leer.nextDouble();
        if (temperatura >= 100) {
            System.out.println("por encima de ");

        }else{
            System.out.println("por debajo de");
        }

    }
    
}
