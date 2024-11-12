/*
 * Parte 4: Pesquise sobre Metodos estaticos e metodos de instancia (atrelado a um objeto)
 *
 ********************* 
 * Metodos estaticos * 
 ********************* 
 * Sao aqueles que podem ser acessados independentemente de um objeto
 * No codigo abaixo, por exemplo, multiplicar e absoluto fazem parte dessa classificacao 
 *
 ************************ 
 * Metodos de instancia *
 ************************ 
 * Sao aqueles que dependem de um objeto para serem acessados
 * No codigo abaixo, o metodo 'converter...' e instanciado, por isso precisa ser acessado por meio de um objeto 
 *
 */

/*
 * Parte 5: Pesquisa sobre Metodos public, private e protected
 *
 **********
 * public * pode ser acessado por quaisquer outras classes, irrestritamente
 **********
 *
 ***********
 * private * seu uso esta restrito somente para a classe em que foi declarado, ou seja, as demais classes nao podem utilizar esses metodos
 *********** 
 *
 *************
 * protected * esse tipo de metodo e mais restrito que o 'public' mas mais permissivo que 'private', podendo ser acessado dentro da mesma classe, dentro do mesmo pacote e dentro de outras subclasses
 *************
 *
 */
public class desafio2{
    double temperatura;
    public void converterCelsiusParaFahrenheit(double celsius) {
        temperatura = (celsius * 9/5) + 32;
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
        desafio2 objeto = new desafio2();
        objeto.converterCelsiusParaFahrenheit(30);

        CalculadoraSoma calc = new CalculadoraSoma();

        System.out.println("Convertendo 30ºC para F: "+objeto.temperatura);
        System.out.println("5 x 6 = "+multiplicar(5,6));
        System.out.println("2 + 2 = "+calc.somar(2,2));
        System.out.println("3.14159265358979 x 6 = "+multiplicar(3.14159265358979,6));
        System.out.println("Raiz quadrada de 2: "+raizQuadrada(2));
        System.out.println("|-2| = "+absoluto(-2));
    }
}
