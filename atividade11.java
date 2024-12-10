import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
    	ArrayList<Carro> lista = new ArrayList<>();
	lista.add(new Carro("Fusca", 1977));	
	lista.add(new SUV("EcoSport", 2012, false));	
	lista.add(new Sedan("Corsa", 2009, true));

	for(int i = 0; i < 3; i++)lista.get(i).exibirDetalhes();	
    }
}
class Carro{
    private String modelo;
    private int ano;

    Carro(String modelo, int ano){
    	this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo(){
        return modelo;	
    }

    public int getAno(){
        return ano;	
    }

    void exibirDetalhes(){
        System.out.printf("Modelo: %s\nAno: %d\n",modelo, ano);
    }
}

class SUV extends Carro{
    boolean motorTurbo;

    SUV(String modelo, int ano, boolean motorTurbo){
        super(modelo, ano);
        this.motorTurbo = motorTurbo;
    }

    @Override
    void exibirDetalhes(){
        System.out.printf("Modelo: %s\nAno: %d\nMotor Turbo: %b\n",getModelo(), getAno(), motorTurbo);
    }
}

class Sedan extends Carro{
    boolean motorHibrido;
    Sedan(String modelo, int ano, boolean motorTurbo){
        super(modelo, ano);
        this.motorHibrido = motorHibrido;
    }
    @Override
    void exibirDetalhes(){
        System.out.printf("Modelo: %s\nAno: %d\nMotor Turbo: %b\n",getModelo(), getAno(), motorHibrido);
    }
}


