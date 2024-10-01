public class PecaLego {
    // Atributos (características da peça)
    String cor;
    String formato;
    int numeroDePinos;

    // Métodos (ações que a peça pode realizar)
    public void mostrarDetalhes() {
        System.out.println("Peça Lego " + cor + " com " + numeroDePinos + " pinos, formato " + formato + ".");
    }

    public void girar() {
        System.out.println("Peça Lego " + cor + " girou 90 graus!");
    }

    public static void main(String[] args) {
        // Criando objetos (peças Lego reais)
        PecaLego pecaVermelha = new PecaLego();
        PecaLego pecaAzul = new PecaLego();
        PecaLego pecaAmarelo = new PecaLego();

        // Definindo características da peça vermelha
        pecaVermelha.cor = "Vermelha";
        pecaVermelha.formato = "Retangular";
        pecaVermelha.numeroDePinos = 4;

        // Definindo características da peça azul
        pecaAzul.cor = "Azul";
        pecaAzul.formato = "Quadrado";
        pecaAzul.numeroDePinos = 2;

        // Definindo características da peça amarela
        pecaAmarelo.cor = "Amarela";
        pecaAmarelo.formato = "Redondo";
        pecaAmarelo.numeroDePinos = 80;

        // Fazendo as peças realizarem ações
        pecaVermelha.mostrarDetalhes();
        pecaAzul.mostrarDetalhes();
        pecaAmarelo.mostrarDetalhes();

        pecaVermelha.girar();
        pecaAzul.girar();
        pecaAmarelo.girar();
    }
}

