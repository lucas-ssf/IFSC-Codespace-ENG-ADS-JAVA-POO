public class Questionario {
    public static void main(String[] args){
        Animal animal = new Cachorro();
        animal.emitirSom();
    }
}
class Animal {

    void emitirSom() {

        System.out.println("O animal emite um som.");

    }

}

 

class Cachorro extends Animal {

    @Override

    void emitirSom() {

        System.out.println("O cachorro late.");

    }

}
