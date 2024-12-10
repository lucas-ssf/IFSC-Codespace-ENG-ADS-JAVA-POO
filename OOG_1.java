public class Abstract1 {
    public static void main(String[] args) {
        // Usando polimorfismo com a classe abstrata
        Veiculo meuCarro = new Carro();
        Veiculo minhaMoto = new Moto();

        // Chamando métodos comuns e específicos
        meuCarro.acelerar(); // Saída: O carro está acelerando.
        minhaMoto.acelerar(); // Saída: A moto está acelerando.

        meuCarro.parar(); // Saída: O veículo parou.
        minhaMoto.parar(); // Saída: O veículo parou.
    }
}

// Classe abstrata que define um modelo genérico para veículos
abstract class Veiculo {
    // Método abstrato (sem implementação) - "O que o veículo faz"
    abstract void acelerar();

    // Método concreto (com implementação) - Detalhe comum a todos os veículos
    void parar() {
        System.out.println("O veículo parou.");
    }
}

// Subclasse que implementa a classe abstrata Veiculo
class Carro extends Veiculo {
    // Implementação do método abstrato
    @Override
    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

// Subclasse que implementa a classe abstrata Veiculo
class Moto extends Veiculo {
    // Implementação do método abstrato
    @Override
    void acelerar() {
        System.out.println("A moto está acelerando.");
    }
}


