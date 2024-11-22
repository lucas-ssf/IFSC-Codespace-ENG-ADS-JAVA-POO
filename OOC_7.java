// Método principal (main)
public class Main {
    public static void main(String[] args) {
        // Criando o motor usando o construtor
        Motor motorDoCarro = new Motor(100); //criando um novo objeto Motor com a potencia de 100 cavalos, e o construtor é chamado para inicializar esse valor

        // Criando o carro usando o construtor e associando o motor
        Carro meuCarro = new Carro("Fiat", motorDoCarro);

        // Mostrando os detalhes do carro
        meuCarro.mostrarDetalhes();
    }
}
// Classe Motor
class Motor {
    int potencia; // Potência do motor

    // Construtor da classe Motor
    Motor(int potencia) {
        this.potencia = potencia; // Inicializando a potência do motor
    }
}

// Classe Carro
class Carro {
    String marca; // Marca do carro
    Motor motor;  // O carro tem um motor

    // Construtor da classe Carro
    Carro(String marca, Motor motor) {
        this.marca = marca;   // Inicializando a marca
        this.motor = motor;   // Associando o motor
    }

    // Método para mostrar os detalhes do carro
    void mostrarDetalhes() {
        System.out.println("Marca do carro: " + marca);
        System.out.println("Potência do motor: " + motor.potencia + " cavalos");
    }
}

