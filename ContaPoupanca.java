package no.banktest;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria{
    
    public ContaPoupanca(String nConta, LocalDate dataDeAbertura, 
        Credenciais credenciais, double saldo) {
        super(nConta, dataDeAbertura, credenciais, saldo);
    }
    
}
