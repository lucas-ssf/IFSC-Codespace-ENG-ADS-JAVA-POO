public class SobrecargaExemplo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emitirSom(); // Saída: "O animal faz um som genérico."
        animal.emitirSom("rugido"); // Saída: "O animal faz um som específico: rugido."
        animal.emitirSom(3); // Saída: "O animal faz um som 3 vezes."
    }
}
class Animal {
    // Método sobrecarregado: várias formas de emitir som
    void emitirSom() {
        System.out.println("O animal faz um som genérico.");
    }

    void emitirSom(String tipoSom) {
        System.out.println("O animal faz um som específico: " + tipoSom);
    }

    void emitirSom(int vezes) {
        System.out.println("O animal faz um som " + vezes + " vezes.");
    }
}
