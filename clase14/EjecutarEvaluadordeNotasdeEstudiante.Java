import java.util.Scanner;

public class EvaluadorEstudiante {
    private double nota1;
    private double nota2;
    private double nota3;
    
    public void setNota1(double nota1) {
        this.nota1 = validarNota(nota1);
    }
    
    public void setNota2(double nota2) {
        this.nota2 = validarNota(nota2);
    }
    
    public void setNota3(double nota3) {
        this.nota3 = validarNota(nota3);
    }
    
    private double validarNota(double nota) {
        Scanner sc = new Scanner(System.in);
        while(nota < 0.0 || nota > 5.0) {
            System.out.print("Nota inválida (0.0-5.0). Ingrese nuevamente: ");
            nota = sc.nextDouble();
        }
        return nota;
    }
    
    public double calcularNotaFinal() {
        return nota1 * 0.3 + nota2 * 0.3 + nota3 * 0.4;
    }
    
    public String determinarAprobacion() {
        double nf = calcularNotaFinal();
        if(nf >= 3.0) {
            return "Aprobado con " + nf;
        } else {
            return "Reprobado con " + nf;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvaluadorEstudiante ee = new EvaluadorEstudiante();
        
        System.out.print("Nota 1: ");
        ee.setNota1(sc.nextDouble());
        
        System.out.print("Nota 2: ");
        ee.setNota2(sc.nextDouble());
        
        System.out.print("Nota 3: ");
        ee.setNota3(sc.nextDouble());
        
        System.out.println("Nota final: " + ee.calcularNotaFinal());
        System.out.println("Resultado: " + ee.determinarAprobacion());
    }
}