package aulas.poo;

public class Pet {

    private String nome;
    private int idade;
    private double peso;

    public Pet(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom(){
        System.out.println("...");
    }

    public void comer(String comida){
        System.out.println("Estou comendo " + comida);
    }

    public void dormir(){
        System.out.println("zzzzzzzzzzzz...");
    }

    public void brincar(){
        System.out.println("Estou brincando...");
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
