// Classe principal para testar o código
public class Main {
    public static void main(String[] args) {
        // Criando objetos de Cachorro e Gato
        Animal meuCachorro = new Cachorro("Rex");
        Animal meuGato = new Gato("Mimi");

        // Exibindo o nome do cachorro e executando ações
        meuCachorro.exibirNome();  // Saída: Nome do animal: Rex
        ((Comportamento) meuCachorro).emitirSom(); // Saída: Rex faz: Au au!
        ((Comportamento) meuCachorro).mover();     // Saída: Rex está correndo!

        // Exibindo o nome do gato e executando ações
        meuGato.exibirNome();      // Saída: Nome do animal: Mimi
        ((Comportamento) meuGato).emitirSom();     // Saída: Mimi faz: Miau!
        ((Comportamento) meuGato).mover();         // Saída: Mimi está caminhando silenciosamente!
    }
}

// Classe abstrata que representa um Animal
abstract class Animal {
    String nome;

    // Construtor para inicializar o nome do animal
    Animal(String nome) {
        this.nome = nome;
    }

    // Método concreto para exibir o nome do animal
    void exibirNome() {
        System.out.println("Nome do animal: " + nome);
    }
}

// Interface que define o comportamento dos animais
interface Comportamento {
    void emitirSom(); // Contrato obrigatório: todas as classes devem implementar
    void mover();     // Contrato obrigatório
}

// Classe concreta Cachorro que herda de Animal e implementa a interface Comportamento
class Cachorro extends Animal implements Comportamento {
    Cachorro(String nome) {
        super(nome); // Passa o nome para o construtor da classe abstrata Animal
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está correndo!");
    }
}

// Classe concreta Gato que herda de Animal e implementa a interface Comportamento
class Gato extends Animal implements Comportamento {
    Gato(String nome) {
        super(nome); // Passa o nome para o construtor da classe abstrata Animal
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está caminhando silenciosamente!");
    }
}
