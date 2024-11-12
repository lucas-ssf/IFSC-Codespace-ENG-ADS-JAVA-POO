public class Carro {
    // Atributos do carro
    String marca;
    String modelo;
    int velocidade;

    // Método que retorna a velocidade do carro
    public int obterVelocidade() {
        return velocidade;
    }

    // Método para mostrar detalhes do carro
    public void mostrarDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo + ", Velocidade: " + velocidade + " km/h");
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Criando dois objetos da classe Carro
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.velocidade = 180;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.velocidade = 200;

        // Mostrando detalhes dos carros
        carro1.mostrarDetalhes();
        carro2.mostrarDetalhes();

        // Comparando as velocidades dos carros
        if (carro1.obterVelocidade() > carro2.obterVelocidade()) {
            System.out.println(carro1.marca + " " + carro1.modelo + " é mais rápido.");
        } else if (carro1.obterVelocidade() < carro2.obterVelocidade()) {
            System.out.println(carro2.marca + " " + carro2.modelo + " é mais rápido.");
        } else {
            System.out.println("Ambos os carros têm a mesma velocidade.");
        }
    }
}
