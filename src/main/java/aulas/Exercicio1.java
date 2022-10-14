package aulas;

import java.util.Scanner;

/*1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
 (switch-case)

        1 – Adição
        2 – Subtração
        3 – Multiplicação
        4 – Divisão*/
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma opção:\n1 – Adição\n2 – Subtração \n3 – Multiplicação \n4 – Divisão");
        int operacao = scanner.nextInt();
        System.out.println("Informe o primeiro valor:");
        Double a = scanner.nextDouble();
        System.out.println("Agora informe o segundo valor:");
        Double b = scanner.nextDouble();
        switch (operacao){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Digite uma opção válida!");
        }
    }
}
