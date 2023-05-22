package no.banktest;

import java.util.ArrayList;

public class BancoDeDados {
    private ArrayList<ContaBancaria> contas;

    public BancoDeDados() {
        this.contas = new ArrayList<>();
    }

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(ContaBancaria conta) {
        contas.remove(conta);
    }

    public void exibirContas() {
        System.out.println("----- Lista de Contas Bancárias -----");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Conta " + (i + 1));
            contas.get(i).exibeConta();
            System.out.println("-------------------------");
        }
    }
}
