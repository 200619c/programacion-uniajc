public class NumerosPares {

    private int numero;

    public int contarPares(int numero){
        int contador = 0, pares = 0;
        while(numero != 0){
            numero /= 10;
            if( numero % 2 == 0){
                pares++;
            }
            contador++;
        }
        return pares;
    } 
    
}