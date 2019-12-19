/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer09;

import java.util.Scanner;

/**
 *
 * @author Filipe Mangue
 */
public class Exerc09 {
    static double valor;
    static double percentagem = 0.70; 
    
    public static double rendimento(double valor){
        return (valor * percentagem) + valor; 
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor depositado: ");
        valor = scan.nextDouble();
        
        System.out.println("Valor apos 1 mes: "+rendimento(valor));
        
    }
}
