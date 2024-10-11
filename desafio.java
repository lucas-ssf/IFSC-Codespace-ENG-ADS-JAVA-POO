/*
 * desafio.java
 *
 * Explicação:
 * O programa começa importando o Scanner para conseguir fazer a leitura dos dados digitados pelo usuário.
 * Dentro do main, o objeto 'entrada' da classe Scanner é definido. Em seguida, o programa inicia um loop que só é parado quando o booleano 'menu' for defindo como falso (opção '0'). Dentro do loop, as opções são impressas na tela através do println, e a leitura dos dados é realizada por meio do método nextInt(), do objeto entrada.
 * Ao ler o dado, o programa é encaminhado de acordo com o switch().
 * A primeira opção realiza a conversão do número digitado, utilizando a Classe Wrapper 'Integer' os respectivos métodos para conversão. Para a conversão de uma base específica, o programa usa o método 'conversor', definido mais abaixo. Por sua vez, o 'conversor' utiliza um algoritmo de conversão de bases e armazena em um objeto da classe StringBuilder; por fim, o método retorna o objeto transformado em uma String.
 * A opação 2 utiliza o Wrapper 'Character' e seus métodos para realizar a "análise" do caractere digitado pelo usuário.
 * A opção 3 simplesmente printa uma mensagem na tela, aproveitando que o loop se repete enquanto 'menu' é verdadeiro.
 * Por fim, a opção 0 encerra o loop ao definir 'menu' como falso
 */
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
                   System.out.printf("Digite a base desejada: ");
                   int base = entrada.nextInt();
                   String numero_convertido = conversor(n,base);
                   System.out.println("Número na base "+base+": "+numero_convertido);
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
   public static String conversor(int numero, int base){
        int divisor = numero, resto, i=0; 
        int[] digito = new int[100];
        StringBuilder resultado = new StringBuilder();
        while(divisor > 0){
            resultado.append(divisor%base);
            divisor = divisor/base;
        }
        return resultado.reverse().toString();
   }
}
