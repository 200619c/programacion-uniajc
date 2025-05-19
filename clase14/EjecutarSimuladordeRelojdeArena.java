public class RelojArena {
    private int segundos;
    
    public RelojArena(int segundos) {
        this.segundos = segundos;
    }
    
    public void contar() throws InterruptedException {
        int tiempoRestante = segundos;
        while(tiempoRestante > 0) {
            System.out.println("Tiempo restante: " + tiempoRestante);
            if(tiempoRestante == segundos/2) {
                System.out.println("¡Mitad del tiempo alcanzada!");
            }
            Thread.sleep(1000);
            tiempoRestante--;
        }
        System.out.println("¡Tiempo terminado!");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Segundos iniciales: ");
        int segundos = sc.nextInt();
        
        RelojArena ra = new RelojArena(segundos);
        ra.contar();
    }
}