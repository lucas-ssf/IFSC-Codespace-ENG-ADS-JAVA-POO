public class SobrescritaExemplo {
    public static void main(String[] args) {
        Animal meuAnimal;

        meuAnimal = new Cachorro();
        meuAnimal.emitirSom(); // Saída: "O cachorro late."

        meuAnimal = new Gato();
        meuAnimal.emitirSom(); // Saída: "O gato mia."
    }
}
class Animal {
    // Método que será sobrescrito
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


