// Método principal (main)
public class Main {
    public static void main(String[] args) {
        // Criando o motor e definindo a potência
        Motor motorDoCarro = new Motor();
        motorDoCarro.potencia = 100; // Definindo a potência do motor

        // Criando o carro e associando o motor
        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";     // Definindo a marca do carro
        meuCarro.motor = motorDoCarro; // Associando o motor ao carro

        // Mostrando os detalhes do carro e a potência do motor
        System.out.println("Marca do carro: " + meuCarro.marca);
        System.out.println("Potência do motor: " + meuCarro.motor.potencia + " cavalos");
    }
}

// Classe Motor
class Motor {
    int potencia; // Potência do motor
}

// Classe Carro
class Carro {
    String marca; // Marca do carro
    Motor motor;  // O carro tem um motor
}


