// Classe principal
public class Main {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaBicicleta = new Bicicleta();

        meuCarro.acelerar();    // Saída: O carro está acelerando!
        meuCarro.frear();       // Saída: O carro está freando!
        meuCarro.parar();       // Saída: O veículo parou.

        minhaBicicleta.acelerar(); // Saída: A bicicleta está acelerando!
        minhaBicicleta.frear();    // Saída: A bicicleta está freando!
        minhaBicicleta.parar();    // Saída: O veículo parou.
    }
}
// Classe abstrata
abstract class Veiculo {
    // Método concreto (as subclasses podem usar como está)
    void parar() {
        System.out.println("O veículo parou.");
    }

    // Métodos abstratos (as subclasses devem implementar)
    abstract void acelerar();
    abstract void frear();
}

// Subclasse que herda a classe abstrata
class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("O carro está acelerando!");
    }

    @Override
    void frear() {
        System.out.println("O carro está freando!");
    }
}

// Subclasse que herda a classe abstrata
class Bicicleta extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("A bicicleta está acelerando!");
    }

    @Override
    void frear() {
        System.out.println("A bicicleta está freando!");
    }
}

