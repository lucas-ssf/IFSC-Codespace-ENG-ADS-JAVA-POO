/******************* RESPOSTA DA ALTERNATIVA 'C' ***************************
 * [getters] e [setters] são métodos usados para acessar e modificar os valores de campos privados de uma classe.
 * Eles são uma prática comum para encapsular dados e controlar o acesso a essas informações.
 *
 * [getters]:são usados para obter o valor de um campo privado
 *
 * [setters]:são usados para modificar o valor de um campo privado
 * 
 * Eles são importantes para acessar e modificar detalhes internos 'privados' de uma determinada classe. Através desses dois métodos, é possível organizar um "controle de acesso", definindo rigorosamente como
 * e quando os valores poderão ser alterados.
 */

/******************* RESPOSTA DA ALTERNATIVA 'D' ***************************
 * 'Pessoa' é uma classe que representa uma pessoa com dois atributos privados: 'nome' e 'idade'
 * Os métodos 'getNome()' e 'getIdade()' são getters que retornam os valores privados de 'nome' e 'idade', respectivamente.
 * Os métodos 'setNome() e 'setIdade()' são setters que, analogamente aos dois anteriores, permitem a alteração dos valores de 'nome' e 'idade'. Para isso, é utilizado o 'this.' de modo a acessar o atributo
 * da classe e distinguí-lo do parâmetro.
 */
public class Main{
    public static void main(String[] args){
        Pessoa p0 = new Pessoa();
        p0.nome = "Dante Alighieri";
        p0.idade = 759;
        Endereco e = new Endereco("Italia", "Emilia-Romagna", "Ravenna", "Centro Storico", "Via Dante Alighieri", 9);
        p0.endereco = e;
        p0.mostrar_detalhes();
    }
}

class Endereco{
    String pais, estado, cidade, bairro, rua;
    int numero;
    Endereco(String pais,String estado,String cidade,String bairro,String rua,int numero){
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }
    void mostrar_endereco(){
        System.out.printf("Endereco: %s, %d, %s, %s - %s, %s\n", rua,numero,bairro,cidade,estado,pais);
    }
}
class Pessoa{
    String nome;
    int idade;
    Endereco endereco;
    void mostrar_detalhes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        endereco.mostrar_endereco();
    }
}

