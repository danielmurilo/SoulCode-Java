import java.util.Arrays;
import java.util.Scanner;

/*Criar programa java que lê N e depois N valores armazenado no array,
        em seguida retorna a soma total e a média dos valores.*/
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de numeros:");
        int tamanho = scanner.nextInt();
        Double[] numeros = new Double[tamanho];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o " + (i+1) + "º valor:");
            numeros[i] = scanner.nextDouble();
        }
        Double soma = 0.00;
        for (Double numero: numeros) {
            soma += numero;
        }
        System.out.println("soma: " + soma);
        System.out.println("media: " + soma / numeros.length);
    }
}
