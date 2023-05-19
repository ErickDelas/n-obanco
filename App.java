package no.banktest;

public class App {
    public static void exibeMenu(){
         System.out.println("Olá, seja bem-vindo ao nosso No!Bank. "
            +"O que você deseja fazer? ");
        System.out.println("Selecione uma opção: ");
        System.out.println("[1] Cadastrar uma conta:");
        System.out.println("[2] Entrar na sua conta: ");
        System.out.println("[0] Sair");
    }
    
    public static void executaOpcao(int opcao){
        switch(opcao){
            case 1: ContaBancaria.cadastraConta();break;
            case 2: ContaBancaria.exibeConta(); break;
            case 3: ContaBancaria.fazerLogin(); break;
            case 4: ContaBancaria.exibeConta(); break;
            default:
                System.out.println("Opção Inválida");
        }
    }
    
}
