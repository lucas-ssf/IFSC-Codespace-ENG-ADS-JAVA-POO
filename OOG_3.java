// Classe principal para testar o exemplo
public class Main {
    public static void main(String[] args) {
        // Criando objetos concretos de Retângulo e Círculo
        FormaGeometrica retangulo = new Retangulo(5, 3);
        FormaGeometrica circulo = new Circulo(4);

        // Chamando o método concreto para exibir o tipo
        retangulo.exibirTipo("Retângulo");
        circulo.exibirTipo("Círculo");

        // Calculando e exibindo a área de cada forma
        System.out.println("Área do retângulo: " + retangulo.calcularArea()); // Saída: 15.0
        System.out.println("Área do círculo: " + circulo.calcularArea());     // Saída: 50.26548245743669
    }
}

// Classe abstrata que representa um Forma Geométrica
abstract class FormaGeometrica {
    // Método abstrato: calcula a área (sem implementação)
    abstract double calcularArea();

    // Método concreto: imprime o tipo da forma
    void exibirTipo(String tipo) {
        System.out.println("Esta é uma forma do tipo: " + tipo);
    }
}

// Classe concreta que representa um Retângulo
class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    // Construtor para inicializar os atributos
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do método abstrato para calcular a área do retângulo
    @Override
    double calcularArea() {
        return largura * altura;
    }
}

// Classe concreta que representa um Círculo
class Circulo extends FormaGeometrica {
    private double raio;

    // Construtor para inicializar o raio
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do método abstrato para calcular a área do círculo
    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}


