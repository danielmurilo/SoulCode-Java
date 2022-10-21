package aulas.poo.escola;

public class Professor extends Pessoa {
    private String formacao;

    public Professor(String nome, String cpf, String email, String formacao) {
        super(nome, cpf, email);
        this.formacao = formacao;
    }

    @Override
    public void seApresentar(){
        System.out.println("Olá, sou professor de " + this.getFormacao());
    }
    public String getFormacao() {
        return formacao;
    }
}
