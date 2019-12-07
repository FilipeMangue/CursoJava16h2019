/*
    5.Faça um programa em leia seu nome e apelido e imprima o seu nome completo
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
public class Exercise05 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nome, apelido;
        System.out.print("Digite seu primeiro nome: ");
        nome = br.readLine();
        System.out.print("Digite seu apelido: ");
        apelido = br.readLine();
        System.out.println("Nome: "+nome+" "+apelido);
    }
}
