package aulas.poo.exercicio;

import java.util.Objects;

public class Livro {

    private String titulo;
    private Autor autor;
    private double preco;

    public Livro(String titulo, Autor autor, double preco) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return Double.compare(livro.getPreco(), getPreco()) == 0 && getTitulo().equals(livro.getTitulo()) && getAutor().equals(livro.getAutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getAutor(), getPreco());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + titulo + '\'' +
                ", autor=" + autor.getNome() +
                ", preco=" + preco +
                '}';
    }

    public static void main(String[] args) {
        Autor jk = new Autor("JK", "jk@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Poter e a Pedra Filosofal", jk, 48.99);
        System.out.println(pedraFilosofal.getTitulo());
        System.out.println(pedraFilosofal.getAutor().getNome());
        System.out.println(pedraFilosofal.getPreco());

        Livro cameraSecreta = jk.escreverLivro("Harry Potter e a Câmara Secreta", 30.00);

    }
}
