public class CalculadoraSoma {
    public static int somar(int... numeros){
        int soma = 0;
        for (int n : numeros){
            soma += n;
        }
        return soma;
    }
    public static void main(String[] args){
        System.out.println("Soma: " + somar(2,-2, 2147483647)); 
        System.out.println("Soma: " + somar(2,-2, 2147483647,1)); 
        System.out.println("Soma: " + somar(2,-2, 2147483647,1,2147483647,1)); 
    }
}
