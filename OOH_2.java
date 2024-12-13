// Classe principal para teste
public class Main {
    public static void main(String[] args) {
        // Usando polimorfismo: Animal é o tipo genérico
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        // Chamando os métodos
        meuCachorro.emitirSom(); // Saída: O cachorro faz: Au au!
        meuCachorro.mover();     // Saída: O cachorro está correndo!

        meuGato.emitirSom();     // Saída: O gato faz: Miau!
        meuGato.mover();         // Saída: O gato está caminhando silenciosamente!
    }
}
// Definindo a interface
interface Animal {
    void emitirSom(); // Contrato obrigatório: qualquer classe que implemente a interface deve definir este método
    void mover();     // Contrato obrigatório
}

// Implementação da interface pela classe Cachorro
class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au au!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo!");
    }
}

// Implementação da interface pela classe Gato
class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }

    @Override
    public void mover() {
        System.out.println("O gato está caminhando silenciosamente!");
    }
}
