package aulas;

import java.util.Scanner;

public class EstudandoArrays {

    public static void main(String[] args) {
        //Em Java os arrays não mudam de tamanho. Este sempre terá 5 elementos.
        int[] numeros = {1, 2, 3, 4, 5};
        //for convencional
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //foreach
        for (int numero: numeros) {
            System.out.println(numero);
        }

        int[] numeros2 = new int[5];
        numeros2[2] = 13;
        for (int numero: numeros2) {
            System.out.println(numero);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array:");
        int tamanho = scanner.nextInt();
        int[] numeros3 = new int[tamanho];
    }
}
