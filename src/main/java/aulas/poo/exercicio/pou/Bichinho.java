package aulas.poo.exercicio.pou;

import java.util.ArrayList;

public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho;
    private Boolean estaDorminndo;

    public Bichinho(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.bucho =new ArrayList<>();
        this.estaDorminndo = false; //acordado
    }

    public void comer(Comida comida) {
        if (this.estaDorminndo) {
            System.out.println("zzzzzZZZZZZ");
        } else { //está acordado
            if (bucho.contains(comida)) { //ele já comeu?
                System.out.println("Já comi " + comida.getNome());
            } else {
                this.bucho.add(comida);
                this.peso += comida.getPeso();
            }
        }
    }

    public void acordar(){
        this.estaDorminndo = false;
    }
}
