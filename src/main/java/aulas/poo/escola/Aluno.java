package aulas.poo.escola;

public class Aluno extends Pessoa{
    private double media;

    public Aluno(String nome, String cpf, String email, double media) {
        super(nome, cpf, email);
        this.media = media;
    }

    @Override
    public void seApresentar(){
        System.out.println("Olá, eu sou um aluno com média " + this.getMedia());
    }
    public double getMedia() {
        return media;
    }
}
