class Carro{
    private String modelo;
    private int ano;

    Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
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
        System.out.printf("Modelo: %s\nAno: %d\nMotor Turbo: %b",modelo, ano, motorTurbo);
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
        System.out.printf("Modelo: %s\nAno: %d\nMotor Turbo: %b",modelo, ano, motorHibrido);
    }
}

public class Main{
    public static void main(String[] args){

    }
}
