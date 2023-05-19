package no.banktest;

import java.util.Scanner;

public class NoBankTest {

    public static void main(String[] args) {
        int opcao = -1;  
        Scanner leitor = new Scanner(System.in);
        while(opcao != 0){
            App.exibeMenu();
            opcao = leitor.nextInt();
            
            if(opcao == 0){
                break;
            }else{                
                App.executaOpcao(opcao);
            }
        }
    }    
}
