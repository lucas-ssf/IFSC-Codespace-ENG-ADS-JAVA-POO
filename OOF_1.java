public class ExemploPolimorfismo {
    public static void main(String[] args) {
        // Herança com sobrescrita de método (sem polimorfismo)
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom(); // Saída: "O cachorro late."

        Gato gato = new Gato();
        gato.emitirSom(); // Saída: "O gato mia."

        // Polimorfismo: referência genérica da superclasse apontando para objetos de subclasses
        Animal animal1 = new Cachorro();
        animal1.emitirSom(); // Saída: "O cachorro late."

        Animal animal2 = new Gato();
        animal2.emitirSom(); // Saída: "O gato mia."
    }
}

class Animal {
    void emitirSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O cachorro late.");
    }
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O gato mia.");
    }
}
