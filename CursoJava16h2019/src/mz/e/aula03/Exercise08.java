/*
    8.	Desenvolva um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, antecessor, sucessor;
        
        System.out.println("Digite um número inteiro: ");
        num = scan.nextInt();
        
        antecessor = num - 1; 
        sucessor = num + 1;
        
        System.out.println("O antecessor de "+num+" é "+antecessor+" e o seu sucessor é "+sucessor);
    }
}
