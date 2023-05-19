package no.banktest;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContaCorrente extends ContaBancaria{
    private String cartaoFisico;
    ArrayList<Transferencia> transferencia;

    public ContaCorrente(String nConta, LocalDate dataDeAbertura, 
        Credenciais credenciais, double saldo) {
        super(nConta, dataDeAbertura, credenciais, saldo);
        this.transferencia = new ArrayList();
    }
    
}
