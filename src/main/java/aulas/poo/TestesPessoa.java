package aulas.poo;

public class TestesPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Daniel";
        pessoa1.sobrenome = "Guedes";
        pessoa1.idade = 41;
        pessoa1.peso = 70;
        pessoa1.altura = 1.72;
        System.out.println(pessoa1.toString());
    }
}
