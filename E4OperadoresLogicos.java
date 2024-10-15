public class E4OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        if (a && b) {
            System.out.println("Linha 1 É MENTIRA");
        }
        if (a || b) {
            System.out.println("Linha 2 - VERDADE");
        }
        if (!(a && b)) {
            System.out.println("Linha 3 VERDADE NÃO MINTO");
        }
    }
}

