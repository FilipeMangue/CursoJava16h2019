/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer07;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exerc07 {
    static String nome;
    static double nota1;
    static double nota2;
    static double nota3;
    
    public static double media(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3)/3;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = scan.next();
        System.out.print("Digite a nota1: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a nota2: ");
        nota2 = scan.nextDouble();
        System.out.print("Digite a nota3: ");
        nota3 = scan.nextDouble();
        
        System.out.println("A media do aluno: "+media(nota1, nota2, nota3));
    }
}
