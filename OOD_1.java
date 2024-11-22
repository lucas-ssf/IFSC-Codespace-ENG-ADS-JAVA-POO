// Programa principal
class Main {
    public static void main(String[] args) {
        Cofre meuCofre = new Cofre();
        // Não podemos acessar o atributo 'segredo' diretamente:
        // System.out.println(meuCofre.segredo); // Isso daria erro!

        // Podemos apenas usar o método público que o cofre oferece
        meuCofre.mostrarSegredo();
    }
}
class Cofre {
    // Atributo privado (protegido)
    private String segredo = "SenhaSegura123";

    // Método público que permite acessar de forma limitada
    public void mostrarSegredo() {
        //System.out.println(segredo); // Isso revela o segredo!
        System.out.println("Segredo do cofre está protegido!");
    }
}


