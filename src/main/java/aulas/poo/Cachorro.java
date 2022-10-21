package aulas.poo;

public class Cachorro extends Pet{

    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca){
        super(nome, idade, peso);
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override
    public void fazerSom(){
        System.out.println("au, au, au");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet("Buddy", 3, 12.5);
        pet1.dormir();
        pet1.comer("Batata");

        Cachorro c = new Cachorro("Rex", 5, 25, "Osso", "Vira-lata");
        

    }
}
