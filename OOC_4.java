// Método principal (main)
public class Main {
    public static void main(String[] args) {
        // Criando o carro e definindo seus atributos
        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";    // Definindo a marca do carro
        meuCarro.potencia = 100;    // Definindo a potência do motor

        // Mostrando os detalhes do carro
        System.out.println("Marca do carro: " + meuCarro.marca);
        System.out.println("Potência do motor: " + meuCarro.potencia + " cavalos");
    }
}
// Classe Carro
class Carro {
    String marca;  // Marca do carro
    int potencia;  // Potência do motor
}


