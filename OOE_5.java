// Classe principal
public class HerancaComFinal {
    public static void main(String[] args) {
        Animal animal = new Animal("Genérico");
        Cachorro cachorro = new Cachorro("Rex");

        animal.emitirSom(); // OK
        cachorro.emitirSom(); // Usa o método da superclasse, pois não pode ser sobrescrito
    }
}
// Classe base (superclasse)
class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    // Método final - não pode ser sobrescrito
    public final void emitirSom() {
        System.out.println("Todos os animais têm sons, mas este método é final.");
    }
}

// Classe derivada (subclasse)
class Cachorro extends Animal {
    Cachorro(String nome) {
        super(nome);
    }

    // Tentativa de sobrescrever o método final - causará erro
    /*
    @Override
    public void emitirSom() {
        System.out.println("Au au!"); // Isto geraria um erro de compilação
    }
    */
}
