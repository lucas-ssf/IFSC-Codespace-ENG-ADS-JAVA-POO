// Programa principal
public class HerancaExemploSemOverride {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal Genérico");
        animal.fazerSom(); // Usa o método genérico da superclasse

        Cachorro cachorro = new Cachorro("Rex");
        cachorro.fazerSom(); // Também usa o método genérico da superclasse
        cachorro.abanarRabo(); // Usa o método exclusivo da subclasse
    }
}
// Superclasse
class Animal {
    String nome;

    // Construtor da superclasse
    Animal(String nome) {
        this.nome = nome;
    }

    // Método genérico para todos os animais
    void fazerSom() {
        System.out.println(nome + " está fazendo um som.");
    }
}

// Subclasse
class Cachorro extends Animal {

    // Construtor da subclasse
    Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse
    }

    // Método exclusivo da subclasse
    void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }

    // Nenhum método é sobrescrito aqui.
}
