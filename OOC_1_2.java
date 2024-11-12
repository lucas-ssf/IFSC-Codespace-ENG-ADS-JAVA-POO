public class Carro {
    // Atributos do carro
    String marca; //atributo da classe Carro
    String modelo; //atributo da classe Carro
    String cor; //atributo da classe Carro

    // Método para mostrar os detalhes do carro
    public void mostrarDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo + " " + cor);
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Definindo os atributos do carro
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.cor= "Cordiburquanfoge";

        // Chamando o método para mostrar os detalhes do carro
        meuCarro.mostrarDetalhes();
    }
}
