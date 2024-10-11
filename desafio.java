import java.util.Scanner;

public class desafio {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       boolean menu = true;
       do{ 
           System.out.println("Menu: Digite o item");
           System.out.println("1- Conversor de Números");
           System.out.println("2- Verificador de Caracteres");
           System.out.println("3- Retornar ao menu inicial");
           System.out.println("0- Sair");
      
           int lista = entrada.nextInt();
           switch(lista) {
               case 1:
                   System.out.printf("Digite o número: ");
                   int n = entrada.nextInt();
                   System.out.println("Decimal: " + n);
                   System.out.println("Binário: " + Integer.toBinaryString(n));
                   System.out.println("Octal: " + Integer.toOctalString(n));
                   System.out.println("Hexadecimal: " + Integer.toHexString(n));
                   break;
               case 2:
                   System.out.printf("Digite o caractere: ");
                   char c = entrada.next().charAt(0);
                   System.out.println("É letra? " + Character.isLetter(c));
                   System.out.println("É digito? " + Character.isDigit(c));
                   System.out.println("É espaco em branco? " + Character.isWhitespace(c));
                   System.out.println("É uma letra maiúscula? " + Character.isUpperCase(c));
                   System.out.println("É uma letra minúscula? " + Character.isLowerCase(c));
                   System.out.println("Está no alfabeto? " + Character.isAlphabetic(c));
                   System.out.println("Está definido no padrão Unicode? " + Character.isDefined(c));
                   break;
               case 3:
                   System.out.println("Voltar ao menu");
                   break;
               case 0:
                   menu = false;
                   break;
               default:
                   System.out.println("Opcao invalida");
               }
           System.out.printf("\n\n");
       }while(menu); 
       entrada.close();
   }
}
