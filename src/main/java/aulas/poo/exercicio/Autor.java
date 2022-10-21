package aulas.poo.exercicio;

public class Autor {
    private String nome;
    private String email;

    public Autor(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Livro escreverLivro(String nome, double preco){
        return new Livro(nome, this, preco);
    }

}
