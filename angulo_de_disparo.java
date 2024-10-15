//Dados a velocidade inicial do projetil e a distância, 
//calcula o angulo do disparo.

//Para calcular os valores utilizei o metodo Math.asin(),
//que retorna o arco-seno, 
//e o objeto Math.PI, que é o valor do Pi.
import java.util.Scanner;

public class angulo_de_disparo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double v, dist, g = 9.81;
        System.out.printf("Digite a velocidade inicial (em m/s): ");
        v = scanner.nextDouble(); //velocidade inicial
        System.out.printf("Digite a distância do alvo (em m): ");
        dist = scanner.nextDouble(); //distancia do alvo
        double sen_2a = (g*dist)/(v*v);
        double a = Math.asin(sen_2a)/2;
        System.out.printf("O angulo que o canhão deve ser posicionado é %.2f graus\n", a/Math.PI*180);

    }
}

