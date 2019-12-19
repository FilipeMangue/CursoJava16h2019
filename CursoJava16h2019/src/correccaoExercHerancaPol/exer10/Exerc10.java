/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer10;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exerc10 {
    static double valor;
    
    public static double prestacao(double valor){
        return valor/5;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valor = scan.nextDouble();
        
        System.out.println("Valor a pagar em 5 prestacoes: "+prestacao(valor));
    }
}
