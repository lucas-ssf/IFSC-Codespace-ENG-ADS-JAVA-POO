public class OOB_12_Teste {
    public static void dividir(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisC#o por zero nC#o C) permitida.");
        }
    }

    public static void main(String[] args) {
        dividir(10, 2); // Sem erro
        dividir(10, 0); // Gera uma exceC'C#o
    }
}
