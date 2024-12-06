import java.util.ArrayList;

public class PolimorfismoGeneralizacao {
    public static void main(String[] args) {
        // Lista de animais
        ArrayList<Animal> animais = new ArrayList<>();

        // Adicionando animais dinamicamente
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Animal());

        // Chamando os métodos diretamente com get(index)
        animais.get(0).emitirSom(); // Saída: "O cachorro late."
        animais.get(1).emitirSom(); // Saída: "O gato mia."
        animais.get(2).emitirSom(); // Saída: "O animal faz um som genérico."

        // Adicionando mais um animal na lista
        animais.add(new Cachorro());
        System.out.println("Novo animal adicionado!");

        // Chamando o novo animal
        animais.get(3).emitirSom(); // Saída: "O cachorro late."
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
