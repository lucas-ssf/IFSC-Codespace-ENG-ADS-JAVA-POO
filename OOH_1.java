// Classe principal
public class Main {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaBicicleta = new Bicicleta();

        meuCarro.acelerar();    // Saída: O carro está acelerando!
        meuCarro.frear();       // Saída: O carro está freando!

        minhaBicicleta.acelerar(); // Saída: A bicicleta está acelerando!
        minhaBicicleta.frear();    // Saída: A bicicleta está freando!
    }
}
// Interface
interface Veiculo {
    // Métodos abstratos (as classes que implementam devem obrigatoriamente definir esses métodos)
    void acelerar();
    void frear();
}

// Classe que implementa a interface
class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando!");
    }
}

// Classe que implementa a interface
class Bicicleta implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando!");
    }
}

