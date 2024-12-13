// Classe principal para testar o código
public class Main {
    public static void main(String[] args) {
        // Instanciando Cachorro diretamente e acessando todos os métodos
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.emitirSom();  // Saída: O cachorro faz: Au au!
        meuCachorro.mover();      // Saída: O cachorro está correndo!
        meuCachorro.abanarRabo(); // Saída: O cachorro está abanando o rabo!

        // Usando o tipo genérico Animal (polimorfismo)
        Animal meuAnimal = new Cachorro();
        meuAnimal.emitirSom();  // OK: O cachorro faz: Au au!
        meuAnimal.mover();      // OK: O cachorro está correndo!
        // meuAnimal.abanarRabo(); -> ERRO: O tipo Animal não conhece o método abanarRabo

        // Fazendo casting para acessar o método específico de Cachorro
        ((Cachorro) meuAnimal).abanarRabo(); // Agora funciona: O cachorro está abanando o rabo!
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

    // Método adicional que não faz parte da interface
    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo!");
    }
}
