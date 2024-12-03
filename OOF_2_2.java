public class ExemploHerancaPolimorfismo {
    public static void main(String[] args) {
        // Herança com sobrescrita de método (sem polimorfismo)
        Carro carro = new Carro();
        carro.acelerar(); // Saída: "O carro está acelerando rapidamente."
        carro.mostrarPlaca();

        Moto moto = new Moto();
        moto.acelerar(); // Saída: "A moto está acelerando rapidamente."
        moto.mostrarPlaca();

        // Polimorfismo: referência genérica da superclasse apontando para objetos de subclasses
        Veiculo veiculo1 = new Carro();
        veiculo1.acelerar(); // Saída: "O carro está acelerando rapidamente."

        Veiculo veiculo2 = new Moto();
        veiculo2.acelerar(); // Saída: "A moto está acelerando rapidamente."
    }
}
class Veiculo {
    private String placa="AAA-1234"; 
    void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
    public void mostrarPlaca(){
        System.out.println("Placa:" + placa);
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
