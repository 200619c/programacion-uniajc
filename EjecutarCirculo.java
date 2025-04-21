public class EjecutarCirculo {
    public static void main(String[] args){
    
        // creacion del odjeto
        Circulo objCirculo1 = new Circulo(r);

        System.out.println("perimetro: " + objCirculo1.calcularPerimetro());

        System.out.println("area: "+ objCirculo1.calcularAre());
    }
}