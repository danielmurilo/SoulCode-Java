package aulas;

import java.util.ArrayList;

public class EstudandoListas {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        nomes.add("Daniel");
        System.out.println(nomes.get(0));
        nomes.set(0, "Guedes");
        numeros.remove(1);
        //numeros.add(5, 23); rangeCheckForAdd - out of bounds
        System.out.println(numeros);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("numeros => posição " + i + " => " + numeros.get(i));
        }
        System.out.println("--------------------------------");
        for (int numero: numeros) {
            System.out.println("numeros => "+ numero);
        }
        System.out.println(numeros.contains(5)); //true/false
        System.out.println(numeros.indexOf(1)); //indica posição
        System.out.println(numeros.indexOf(5000)); //-1 se não encontrado

    }

}
