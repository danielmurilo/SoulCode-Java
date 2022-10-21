package aulas.poo.escola;

public class Pessoa {
    private String nome;
    private String email;
    private String cpf;

    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public void seApresentar(){
        System.out.println("Olá, meu nome é " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
