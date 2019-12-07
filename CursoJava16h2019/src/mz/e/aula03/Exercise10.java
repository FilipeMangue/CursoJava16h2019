/*
    10.	Faça um algoritmo que leia dois números e mostre qual o maior dos dois
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        
        System.out.print("Digite um número 1: ");
        num1 = scan.nextInt();
        System.out.print("Digite um número 2: ");
        num2 = scan.nextInt();
        
        if (num1 > num2) {
            System.out.println("O número 1("+num1+") é o Maior.");
        } else if (num1 < num2) {
            System.out.println("O número 2("+num2+") é o Maior.");
        }
    }
}
