// Classe principal para testar o exemplo
public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Cachorro e Gato
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        // Chamando o método emitirSom para cada animal
        meuCachorro.emitirSom(); // Saída: O cachorro faz: Au Au!
        meuGato.emitirSom();     // Saída: O gato faz: Miau!

        // Chamando o método concreto dormir
        meuCachorro.dormir();    // Saída: O animal está dormindo...
        meuGato.dormir();        // Saída: O animal está dormindo...
    }
}

// Classe abstrata que representa um Animal
abstract class Animal {
    // Método abstrato: emitirSom (sem implementação)
    abstract void emitirSom();

    // Método concreto: dormir (implementação padrão para todos os animais)
    void dormir() {
        System.out.println("O animal está dormindo...");
    }
}

// Subclasse concreta que representa um Cachorro
class Cachorro extends Animal {
    // Implementação do método abstrato emitirSom
    @Override
    void emitirSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

// Subclasse concreta que representa um Gato
class Gato extends Animal {
    // Implementação do método abstrato emitirSom
    @Override
    void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }
}


