// Classe principal
public class HerancaExemploSimples {
    public static void main(String[] args) {
        // Criando um objeto da subclasse Bicicleta
        Bicicleta minhaBike = new Bicicleta();
        
        // Configurando atributos nos construtores
        minhaBike.setVelocidade(20);
        minhaBike.setMarchas(5);

        // Mostrando detalhes
        minhaBike.mostrarDetalhes();
    }
}
// Superclasse
class Veiculo {
    int velocidade;

    // Método (Construtor) para definir a velocidade
    void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Método para mostrar a velocidade
    void mostrarVelocidade() {
        System.out.println("A velocidade é " + velocidade + " km/h.");
    }
}

// Subclasse
class Bicicleta extends Veiculo {
    int numeroMarchas;

    // Método específico da Bicicleta
    void setMarchas(int marchas) {
        this.numeroMarchas = marchas;
    }

    // Método para mostrar detalhes da bicicleta
    void mostrarDetalhes() {
        System.out.println("A bicicleta tem " + numeroMarchas + " marchas.");
        mostrarVelocidade(); // Reutiliza o método da superclasse
    }
}
