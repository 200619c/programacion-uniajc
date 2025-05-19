public class VerificadorPrimos {
    private int inicio;
    private int fin;
    
    public VerificadorPrimos(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    
    public int contarPrimos() {
        int contador = 0;
        for(int i = inicio; i <= fin; i++) {
            if(esPrimo(i)) contador++;
        }
        return contador;
    }
    
    private boolean esPrimo(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SystemSystem.out.print("Inicio del rango: ");
        int inicio = sc.nextInt();
        System.out.print("Fin del rango: ");
        int fin = sc.nextInt();
        
        VerificadorPrimos vp = new VerificadorPrimos(inicio, fin);
        System.out.println("Total de primos: " + vp.contarPrimos());
    }
}