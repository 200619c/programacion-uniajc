import java.util.Scanner;

public class DulceAlgoritmo {

    public static void main(String[] args) {
        // Definir constantes
        final double COSTO_MATERIA_PRIMA = 2.50;
        final double COSTO_EMPAQUE = 0.50;
        final double GANANCIA = 0.30;
        final int BARRAS_POR_CAJA = 10;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de barras producidas
        System.out.print("Ingrese la cantidad de barras de chocolate producidas en un día: ");
        int N = scanner.nextInt();

        // Calcular el costo total de producción
        double costoTotalProduccion = N * (COSTO_MATERIA_PRIMA + COSTO_EMPAQUE);

        // Calcular el precio de venta por barra
        double precioVentaPorBarra = (costoTotalProduccion / N) * (1 + GANANCIA);

        // Calcular el ingreso total del día
        double ingresoTotal = N * precioVentaPorBarra;

        // Calcular el número de cajas completas y barras sobrantes
        int cajasCompletas = N / BARRAS_POR_CAJA;
        int barrasSobrantes = N % BARRAS_POR_CAJA;

        // Mostrar los resultados en pantalla
        System.out.println("\n--- Resultados ---");
        System.out.printf("Costo total de producción: $%.2f%n", costoTotalProduccion);
        System.out.printf("Precio de venta por barra: $%.2f%n", precioVentaPorBarra);
        System.out.printf("Ingreso total del día: $%.2f%n", ingresoTotal);
        System.out.println("Cajas completas: " + cajasCompletas);
        System.out.println("Barras sobrantes: " + barrasSobrantes);

        // Cerrar el Scanner
        scanner.close();
    }
}
