/*
    6.Faça um programa que leia dois números e imprima a sua soma
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
public class Exercise06 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num1, num2, soma;
        
        System.out.print("Digite o primeiro número: ");
        num1 = Double.parseDouble(br.readLine());
        System.out.print("Digite o segundo número: ");
        num2 = Double.parseDouble(br.readLine());
        
        soma = num1 + num2;
        
        System.out.println("Soma dos números: "+soma);
    }
}
