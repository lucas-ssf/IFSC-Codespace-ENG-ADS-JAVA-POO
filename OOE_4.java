// Classe principal
public class HerancaExemplo {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal Genérico");
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");

        // Chamando o método reescrito
        animal.emitirSom(); // Saída: O animal emite um som genérico.
        cachorro.emitirSom(); // Saída: Rex diz: Au au!
        gato.emitirSom(); // Saída: Mimi diz: Miau!
    }
}
// Classe base Animal
class Animal {
    String nome;

    // Construtor da classe Animal
    Animal(String nome) {
        this.nome = nome;
    }

    // Método que será sobrescrito
    public void emitirSom() {
        System.out.println("O animal emite um som genérico.");
    }
}

// Classe derivada Cachorro
class Cachorro extends Animal {

    // Construtor da classe Cachorro
    Cachorro(String nome) {
        super(nome); // Chamando o construtor da classe base
    }

    // Reescrita do método emitirSom
    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au au!");
    }
}

// Classe derivada Gato
class Gato extends Animal {

    // Construtor da classe Gato
    Gato(String nome) {
        super(nome); // Chamando o construtor da classe base
    }

    // Reescrita do método emitirSom
    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }
}




