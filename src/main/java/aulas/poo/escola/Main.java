package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fulano","000.000.000-00", "fulano@uol.com", 8.5);
        aluno.seApresentar();

        Professor prof = new Professor("Girafales", "999.999.999-99", "girafales@aol.com", "TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("", "", "");
        Pessoa p2 = new Aluno("", "", "", 0.0);
        Pessoa p3 = new Professor("", "", "", "");

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for (Pessoa pessoa : pessoas){
            pessoa.seApresentar();
        }

    }
}
