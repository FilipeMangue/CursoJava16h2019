/*
 8. Faça um programa que leia 3 números inteiros distintos e escreva o menor deles.
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  num1, num2, num3, menor = 0;
        
        System.out.print("Digite um número: ");
        num1 = scan.nextInt();
        System.out.print("Digite outro número: ");
        num2 = scan.nextInt();
        System.out.print("Digite um outro número: ");
        num3 = scan.nextInt();
        
        if(num1 < num2 && num1 < num3){
            menor = num1;
        } else if(num2 < num1 && num2 < num3){
            menor = num2;
        } else if(num3 < num2 && num3 < num1){
            menor = num3;
        }
        
        System.out.println("O número "+menor+"  é o menor de todos.");
    }
}
