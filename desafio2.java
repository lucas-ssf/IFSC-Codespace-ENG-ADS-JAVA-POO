public class desafio2{
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }


    public static double absoluto(double numero){
        if(numero < 0) numero = numero*(-1);
        return numero;
    } 
     private static double raizQuadrada(double numero) {
        double x = numero;

        for (int i = 0; i < 10; i++) {
            x = (x + numero / x) / 2;  // Fórmula de Herão
        }

        return x;
    }   
    public static void main(String[] args){
        System.out.println("Convertendo 30ºC para F: "+converterCelsiusParaFahrenheit(30));
        System.out.println("5 x 6 = "+multiplicar(5,6));
        System.out.println("3.14159265358979 x 6 = "+multiplicar(3.14159265358979,6));
        System.out.println("Raiz quadrada de 2: "+raizQuadrada(2));
        System.out.println("|-2| = "+absoluto(-2));
    }
}
