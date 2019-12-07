/*
   4. Faça um programa que leia o seu nome e imprima em tela
 */
package mz.e.aula03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise04 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nome;
        System.out.print("Digite seu nome: ");
        nome = br.readLine();
        System.out.print("Nome: "+nome);
    }
}
