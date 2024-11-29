public class Exemplo {
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        obj.metodoAntigo(); // AVISO do compilador
        obj.metodoNovo(); // Sem problemas
    }
}

class MinhaClasse {
    @Deprecated
    public void metodoAntigo() {
        System.out.println("Este método está obsoleto.");
    }

    public void metodoNovo() {
        System.out.println("Use este método.");
    }
}
