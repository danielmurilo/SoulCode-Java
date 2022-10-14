import java.util.Scanner;

public class EstudandoStrings {
    public static void main(String[] args) {
        //Strings são cadeias de caracteres
        //"José" -> J = 0, o = 1, s = 2 e é = 3

        String nome = "Pedro";
        if (nome == "Pedro") {
            System.out.println("São iguais");
            //Esta comparação é feita apenas se os valores alocados em memória (endereços) são iguais
        }
        System.out.println("Digite seu sobrenome:");
        Scanner scanner = new Scanner(System.in);
        String sobreNome = scanner.nextLine();
        if (sobreNome == "Pereira") {
            System.out.println("São Iguais");
        } else {
            System.out.println("São Diferentes!");
            //Neste exemplo os endereços são diferentes, mesmo digitando o mesmo texto.
        }
        //Se quisermos comparar valores de Strings, devemos usar o método equals:
        if (sobreNome.equals("Pereira")) {
            System.out.println("São Iguais");
        } else {
            System.out.println("São Diferentes");
        }
        //outros métodos:
        String java = "Java";
        String ja = java.substring(0,2);
        String va = java.substring(2);
        System.out.println(ja);
        System.out.println(va);
        System.out.println(java.substring(1,4));

        String data[] = "20/08/1981".split("/");
        System.out.println(data.toString());

        String login[] = "danielmurilo@yahoo.com.br".split("@");



    }
}
