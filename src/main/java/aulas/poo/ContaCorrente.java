package aulas.poo;

import java.util.ArrayList;

public class ContaCorrente {
    String agencia;
    String conta;
    Pessoa titular;
    Boolean Poupanca;
    ArrayList<Transacao> transacoes = new ArrayList<Transacao>();

    double saldo(){
        double total = 0.00;
        for (Transacao transacao: transacoes) {
            total += transacao.valor;
        }
        return total;
    }
}
