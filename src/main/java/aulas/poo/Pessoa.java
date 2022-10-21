package aulas.poo;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    Pessoa() {
        this.nome = "";
        this.sobrenome = "";
        this.idade = 0;
        this.altura = 0.00;
        this.peso = 0.00;
    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Oi, meu nome é "+this.nome+" "+this.sobrenome+ " tenho "+this.idade+" anos, minha altura é "+this.altura+"m e meu peso é "+this.peso+"kg.";
    }

    void dizOla(){
        System.out.println("Olá, tudo bem?");
    }

    double imc(){
        return this.peso/(this.altura*this.altura);
    }
}
