import java.util.Scanner;

public class Ejercicio4punto11 {
    public static void main(String[]ärgs) {
        Scanner Scanner = new 
        Scanner (System.in);

        System.out.print("ingrese el primer numero: ");
        double numero1 = Scanner .nextDouble();
       
        System.out.print("Ingrese el segundo numero: ");
         double numero2 = Scanner .nextDouble();
          
         System.out.print("Seleccione la operacion (1: suma, 2: resta, 3: multiplicacion, 4: Division): ");
         int SeleccionOp = 
         Scanner .nextInt();

         double resultado = 0;
         boolean operacionValida = true; 
         switch (selecione) {
            case 1:
            resultado = numero1 + numero2;

            System.out.println("Resultado de la suma:" + resultado);

                
                break;
                case 2:
                resultado = numero1 - numero2;
                 System.out.println("Resultado de la resta:" + resultado);
                 
                 break;
                 case 3:
                 resultado = numero1 * numero2;
                 System.out.println("Resultado de la multiplicacion:" + resultado);
                  
                 break;
                 case 4:
                 if (numero2 != 0){
                    resultado = numero1 / numero2;
                
                 System.err.println("Resultado de la division:" + resultado); } else {
                     
                    System.out.println("Error: No se puede dividir por cero.");
                    
                    operacionValida = false;

                 }
                    break;
                  default:

                  System.out.println("Operacion no valida.");

                  operacionValida = false;

                  Scanner.close();

         }

    }
}
