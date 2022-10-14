package aulas;

import java.util.Scanner;

//4) Criar um programa que lê a idade de uma pessoa e diz se ela é maior de idade ou não.
public class Exercicio4 {

    public static void main(String[] args) {
        System.out.println("Digite a idade:");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de Idade!");
        } else {
            System.out.println("Menor de Idade!");
        }
    }
}
