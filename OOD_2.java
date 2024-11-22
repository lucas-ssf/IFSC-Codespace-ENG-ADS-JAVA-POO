// Programa principal
class Main {
    public static void main(String[] args) {
        // Criando um objeto Livro
        Livro meuLivro = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        // Não é possível acessar diretamente os atributos titulo e autor
        // System.out.println(meuLivro.titulo); // Isso daria erro!

        // Só podemos mostrar as informações do livro de forma controlada
        meuLivro.mostrarInfo();
    }
}

class Livro {
    // Atributos privados (protegidos)
    private String titulo;
    private String autor;

    // Método público para mostrar informações do livro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }

    // Construtor para inicializar o livro
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}


