import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    private int numeroSecreto;
    
    public JuegoAdivinanza() {
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }
    
    public void jugar() {
        Scanner sc = new Scanner(System.in);
        int intento;
        boolean adivinado = false;
        
        System.out.println("Adivina el número secreto entre 1 y 100");
        
        while(!adivinado) {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
            
            if(intento == numeroSecreto) {
                adivinado = true;
                System.out.println("¡Correcto! El número era " + numeroSecreto);
            } else if(intento < numeroSecreto) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }
        }
    }
    
    public static void main(String[] args) {
        JuegoAdivinanza ja = new JuegoAdivinanza();
        ja.jugar();
    }
}