/*
 * Explicação da atividade:
 * No início e no fim do programa é utilizado o método repeat(), que consiste na repetição da string original n vezes
 * Em seguida, o método trim() remove os espaços em branco do início e do fim da string
 * O método length() verifica o tamanho da string
 * Logo abaixo, os métodos toUpperCase() e toLowerCase() transformam toda string em letras maiúsculas ou minúsculas
 * O método endsWith() é utilizado algumas vezes, e verifica se o final da string corresponde ao valor informado
 * Por fim, o método substring() retorna uma parte da string de acordo com o índice inicial e o final
 */


import java.util.Scanner;


public class atividade7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String barra = "-".repeat(70);
        System.out.println(barra);
        System.out.printf("Digite algo: ");
        String algo = entrada.nextLine();
        String algo_sem_espacos = algo.trim();
        int tamanho = algo.length();
        String algo_upper = algo.toUpperCase();
        String algo_lower = algo.toLowerCase();
        boolean final_ao = algo_lower.endsWith("o") || algo_lower.endsWith("a");
        
        System.out.printf("Sua entrada sem espaços no início e no fim: %s\n",algo_sem_espacos);
        System.out.printf("Tamanho do que você digitou: %d\n",tamanho);
        System.out.printf("TUDO EM MAIÚSCULO: %s\n",algo_upper);
        System.out.printf("tudo minúsculo: %s\n",algo_lower);

        if(final_ao){
            String alguinho = algo_lower.substring(0, tamanho-1)+"inh"+algo.substring(tamanho-1,tamanho);
            String algao;
            if(algo_lower.endsWith("o")) algao = algo_upper.substring(0, tamanho-1)+"ÃO";
            else algao = algo_upper.substring(0, tamanho-1)+"ONA";
            System.out.printf("Sua entrada terminando com diminutivo: %s\n",alguinho);
            System.out.printf("SUA ENTRADA NO AUMENTATIVO: %s\n",algao);
            
        }
        System.out.println(barra);
    }
}