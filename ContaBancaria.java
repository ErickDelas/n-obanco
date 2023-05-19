package no.banktest;

import java.time.LocalDate;
import java.util.Scanner;

public class ContaBancaria {
    private String nConta;
    private LocalDate dataDeAbertura;
    private Credenciais credenciais; 
    private App app;
    private double saldo;
    private int totContas = 0;
    String dadosConta[][] = new String [100][7];

    public ContaBancaria(){
        this.credenciais = new Credenciais ();
    }
    
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
        System.out.println("\n----- // ----- // ----- // ---- // ----- //");
        
        System.out.println("Olá, vamos cadastrar uma conta nova para você.");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe alguns dados para salvar no sistema: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        this.credenciais.setNome(nome);
        
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        this.credenciais.setCpf(cpf);
        
        System.out.print("Data de nascimento: (dd/mm/aaaa/)");
        String dtNascimento = sc.nextLine();
        this.credenciais.setDtNascimento(dtNascimento);
        
        System.out.println("Agora, iremos pedir alguns meios de contatos seu: ");
        System.out.print("Nos informe o seu email: ");
        String email = sc.nextLine();
        this.credenciais.setEmail(email);
        
        System.out.print("Agora, o seu numero de celular: ");
        String nCelular = sc.nextLine();
        this.credenciais.setnCelular(nCelular);
        
        System.out.println("Otimo, recebemos todos os seus dados. Agora, crie um usuario e senha.");
        System.out.print("Informe um usuario: ");
        String usuario = sc.nextLine();
        this.credenciais.setLogin(usuario);
        
        System.out.print("Informe uma Senha: ");
        String senha = sc.nextLine();
        this.credenciais.setSenha(senha);
        
        dadosConta[totContas][0] = this.credenciais.getNome();
        dadosConta[totContas][1] = this.credenciais.getCpf();
        dadosConta[totContas][2] = this.credenciais.getDtNascimento();
        dadosConta[totContas][3] = this.credenciais.getEmail();
        dadosConta[totContas][4] = this.credenciais.getnCelular();
        dadosConta[totContas][5] = this.credenciais.getLogin();
        dadosConta[totContas][6] = this.credenciais.getSenha();
        
        totContas++;
        System.out.print("-----Conta cadastrada com sucesso!-----\n");
    }
    
    void fazerLogin(){
        
        Scanner sc = new Scanner(System.in);
        int i =0;
        int j =0;
        System.out.println("\n----- // ----- // ----- // ---- // ----- //");
        
        System.out.println("Olá, que bom ter você aqui novamente.");
        while (i ==0){
            System.out.print("Usuario: ");
            String usuario = sc.next();
            if(usuario.equals(this.credenciais.getLogin())){
                System.out.print("Senha: ");
                String senha = sc.next();
                if(senha.equals(this.credenciais.getSenha())){
                    System.out.println("Usuario e senha estão corretos!");
//                    App.menuPrincipal();
                    i++;
                }
            }
        }
    }
    
    void excluirConta(){
        for(int i = 0; i < totContas; i++){
            for(int j = 0; j<7; j++){
                dadosConta[i][j] = null;
            }
        }
        this.credenciais.apagarCredenciais();
    }
    
    void exibeConta(){
        System.out.println("----- Dados da sua Conta Bancaria -----");
        
        for(int i = 0; i < totContas; i++){
            System.out.printf("%d - Nome: %s \tCPF: %s"
                + "\tData de nascimento: %s \tEmail: %s \tNumero de celular: %s\t %s    %s\n"
                , (i+1), dadosConta[i][0], dadosConta[i][1], dadosConta[i][2], 
                dadosConta[i][3], dadosConta[i][4], dadosConta[i][5], dadosConta[i][6]);
        }
    }
}
