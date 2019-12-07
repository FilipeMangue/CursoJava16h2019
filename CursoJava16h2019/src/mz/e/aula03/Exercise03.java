/*
3.  Escreva um pequeno programa que peça o seu nome, sua ocupação e ano de nascimento. Em seguida, 
    imprima na tela as 2 informações a seguir:
    Eu chamo me xxxxx,  sou xxxxx e tenho xxxxx anos de idade.
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, ocupacao;
        int ano_nasc, idade;
        
        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.print("Sua ocupação: ");
        ocupacao = scan.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        ano_nasc = scan.nextInt();
        
        idade = 2019 - ano_nasc;
        
        System.out.println("Eu chamo me "+nome+",  sou "+ocupacao+" e tenho "+idade+" anos de idade.");
    }
}
