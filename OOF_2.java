public class ExemploHerancaPolimorfismo {
    public static void main(String[] args) {
        // Herança com sobrescrita de método (sem polimorfismo)
        Carro carro = new Carro();
        carro.acelerar(); // Saída: "O carro está acelerando rapidamente."

        Moto moto = new Moto();
        moto.acelerar(); // Saída: "A moto está acelerando rapidamente."

        // Polimorfismo: referência genérica da superclasse apontando para objetos de subclasses
        Veiculo veiculo1 = new Carro();
        veiculo1.acelerar(); // Saída: "O carro está acelerando rapidamente."

        Veiculo veiculo2 = new Moto();
        veiculo2.acelerar(); // Saída: "A moto está acelerando rapidamente."
    }
}
class Veiculo {
    void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
}

class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("O carro está acelerando rapidamente.");
    }
}

class Moto extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("A moto está acelerando rapidamente.");
    }
}
