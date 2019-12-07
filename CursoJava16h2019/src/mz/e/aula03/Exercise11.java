/*
    11.	Crie um programa que calcule a média de um aluno para a disciplina de programação. 
        O aluno deve informar seu nome e as três notas da matéria.
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1, nota2 = 0, nota3 = 0, media, soma;
        
        System.out.print("Digite nota 1: ");
        nota1 = scan.nextDouble();
        
        System.out.print("Digite nota 1: ");
        nota2 = scan.nextDouble();
        
        System.out.print("Digite nota 1: ");
        nota3 = scan.nextDouble();
        
        soma = nota1 + nota2 + nota3;
        
        media = soma / 3;
        
        System.out.println("A média  dos testes é "+media);
    }
}
