package aulas.poo.escola;

public class Calculadora {

    public static  final double pi = 3.14;

    //static não pertence ao objeto, pertence a classe
    public static double soma (double a, double b) {
        return a + b;
    }

    public static double subtracao (double a, double b) {
        return a - b;
    }

    public static double multiplicacao (double a, double b) {
        return a * b;
    }

    public static double divisao (double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        //como se chama métodos estáticos?
        double resultadoSoma = Calculadora.soma(1, 2);
        double resultadoSub = Calculadora.subtracao(2, 1);
        double resultadoDiv = Calculadora.divisao(4,2);
        double resultadoMult = Calculadora.multiplicacao(2, 2);
        System.out.println(Calculadora.pi);
    }
}
