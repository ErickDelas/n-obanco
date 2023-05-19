package no.banktest;

import java.time.LocalDate;
import java.util.Scanner;

public class ContaBancaria {
    private String nConta;
    private LocalDate dataDeAbertura;
    private Credenciais credenciais; 
    private double saldo;
    private int totContas = 0;
    String dadosConta[][] = new String [100][2];

    public ContaBancaria(String nConta, LocalDate dataDeAbertura,
        Credenciais credenciais, double saldo){
        this.nConta = nConta;
        this.dataDeAbertura = dataDeAbertura;
        this.credenciais = credenciais;
        this.saldo = saldo;
    }

    public Credenciais getCredenciais() {
        return credenciais;
    }
    
    void cadastraConta(){
        System.out.println("Olá, vamos cadastrar uma conta nova para você.");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe alguns dados para salvar no sistema: ");
        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Data de nascimento: (dd/mm/aaaa/)");
        int dia = sc.nextInt(); int mes = sc.nextInt(); int ano = sc.nextInt();
        System.out.println("Você gostaria de receber informações sobre o nosso banco? [S/N]");
        char resp = sc.next().charAt(0);
        if(resp == 'S'){
            System.out.println("Nos informe o seu email: ");
            String email = sc.nextLine();
            System.out.println("Agora, o seu numero de celular: ");
            String nCelular = sc.nextLine();
        }
        System.out.println("Otimo, recebemos todos os seus dados. Agora, crie um usuario e senha.");
        System.out.print("Informe um usuario: ");
        String usuario = sc.nextLine();
        this.credenciais.setLogin(usuario);
        System.out.print("Informe uma Senha: ");
        String senha = sc.nextLine();
        this.credenciais.setSenha(senha);
        dadosConta[totContas][0] = this.credenciais.getLogin();
        dadosConta[totContas][1] = this.credenciais.getSenha();
        
        totContas++;
        System.out.print("-----Conta cadastrada com sucesso!-----");
    }
    
    static void fazerLogin(){
        
    }
    
    public void exibeConta(){
        System.out.println("Conta Bancaria");
        
        for(int i = 0; i < totContas; i++){
            System.out.printf("%d\tCPF: %s\tNome: %s\tN. SUS: %s"
            + "\tDependente: %s\tCPF do dependente: %s\n", i, 
            clientes[i][0], clientes[i][1], clientes[i][2], clientes[i][3], 
            clientes[i][4]);
        }
    }
    }
    
}

