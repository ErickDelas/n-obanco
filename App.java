package no.banktest;

import java.util.Scanner;

public class App {
    ContaBancaria cBanco = new ContaBancaria();
    
    static void menuInicial(){
         System.out.println("\nOlá, seja bem-vindo ao nosso No!Bank. "
            +"O que você deseja fazer? ");
        System.out.println("Selecione uma opção: ");
        System.out.println("[1] Cadastrar uma conta:");
        System.out.println("[2] Entrar na sua conta: ");
        System.out.println("[0] Sair");
        System.out.print("Resposta: \t");
    }
    
    static void menuPrincipal(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Selecione uma ação para ser feita na sua conta: ");
        System.out.println("[3] Transferencia:");
        System.out.println("[4] Saque: ");
        System.out.println("[5]Deposito: ");
        System.out.println("[6] Excluir conta: ");
        System.out.println("[7] Para sair da conta: ");
        System.out.print("Resposta: \t");
//      int resp = sc.nextInt();
    }
    
    public void executaOpcao(int opcao){
        switch(opcao){
            case 1: cBanco.cadastraConta();break;
            case 2: cBanco.fazerLogin(); break;
            case 3: cBanco.exibeConta(); break;
            case 6: cBanco.excluirConta(); break;
            case 7: break;
            default:
                System.out.println("Opção Inválida");
        }
    }
    
}

