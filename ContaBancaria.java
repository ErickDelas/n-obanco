package no.banktest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancaria {
    private String nConta;
    private LocalDate dataDeAbertura;
    private Credenciais credenciais;
    private App app;
    private double saldo;

    public ContaBancaria() {
        this.credenciais = new Credenciais();
    }

    public ContaBancaria(String nConta, LocalDate dataDeAbertura, Credenciais credenciais, double saldo) {
        this.nConta = nConta;
        this.dataDeAbertura = dataDeAbertura;
        this.credenciais = credenciais;
        this.saldo = saldo;
    }

    public Credenciais getCredenciais() {
        return credenciais;
    }

    void cadastraConta(ArrayList<ContaBancaria> listaContas) {
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

        listaContas.add(this);

        System.out.println("-----Conta cadastrada com sucesso!-----");
    }

    void fazerLogin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n----- // ----- // ----- // ---- // ----- //");
        System.out.println("Olá, que bom ter você aqui novamente.");

        System.out.print("Usuário: ");
        String usuario = sc.next();

        if (usuario.equals(this.credenciais.getLogin())) {
            System.out.print("Senha: ");
            String senha = sc.next();

            if (senha.equals(this.credenciais.getSenha())) {
                System.out.println("Usuário e senha estão corretos!");
                // App.menuPrincipal();
            }
        }
    }

    void excluirConta(ArrayList<ContaBancaria> listaContas) {
        listaContas.remove(this);
        this.credenciais.apagarCredenciais();

        System.out.println("Conta excluída com sucesso!");
    }

    void exibeConta() {
        System.out.println("----- Dados da sua Conta Bancária -----");
        System.out.println("Nome: " + this.credenciais.getNome());
        System.out.println("CPF: " + this.credenciais.getCpf());
        System.out.println("Data de nascimento: " + this.credenciais.getDtNascimento());
        System.out.println("Email: " + this.credenciais.getEmail());
        System.out.println("Número de celular: " + this.credenciais.getnCelular());
        System.out.println("Usuário: " + this.credenciais.getLogin());
        System.out.println("Senha: " + this.credenciais.getSenha());
    }
}
