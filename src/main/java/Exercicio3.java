import java.util.Objects;
import java.util.Scanner;

/*3) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes
        que V1 e V2 possuem valores idênticos nas mesmas posições.*/
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho dos vetores:");
        int tamanho = scanner.nextInt();
        Double[] v1 = new Double[tamanho];
        Double[] v2 = new Double[tamanho];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Informe o " + (i+1) + "º valor de V1:");
            v1[i] = scanner.nextDouble();
        }
        for (int i = 0; i < v2.length; i++) {
            System.out.println("Informe o " + (i+1) + "º valor de V2:");
            v2[i] = scanner.nextDouble();
        }
        for (int i = 0; i < v1.length; i++) {
            if (Objects.equals(v1[i], v2[i])) {
                System.out.println("Na posição " + (i+1) + " os valores são iguais: " + v1[i]);
            }
        }
    }
}
