package aulas.poo;

public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal{

    @Override
    public void dormir() {
        System.out.println("zzzzzzzzzzzzz miau...");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("peixe")){
            System.out.println("Adoro peixe!");
        } else {
            System.out.println("Só como peixe!");
        }
    }
}

class Galinha implements Animal{

    @Override
    public void dormir() {
        System.out.println("có có zzzzzzzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Cocoricó!!!");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Comendo " + comida);
    }

    public static void main(String[] args) {
        Animal bichano = new Gato();
        bichano.fazerSom();
        bichano.comer("Carne");

        Animal pinto = new Galinha();
        pinto.fazerSom();
        pinto.comer("milho");
    }
}
