package no.banktest;

import java.util.Scanner;

public class NoBankTest {

    public static void main(String[] args) {
        App app = new App();
        int opcao = -1;  
        Scanner leitor = new Scanner(System.in);
        while(opcao != 0){
            App.menuInicial();
            opcao = leitor.nextInt();
            
            if(opcao == 0){
                break;
            } else{
                app.executaOpcao(opcao);
            }
            if(opcao == 2){
                App.menuPrincipal();
                opcao = leitor.nextInt();
                app.executaOpcao(opcao);
            }
        }
    }
}
