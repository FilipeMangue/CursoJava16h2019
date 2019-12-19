/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer06;

import java.util.Scanner;

/**
 *
 * @author Filipe Mangue
 */
public class Exerc06 {
    static String nome;
    static double salarioFixo;
    static double totalVendasDinheiro;
    static double comissao = 0.15;
    
    public static double salarioFinal(double salarioFixo, double totalVendasDinheiro){
        return (totalVendasDinheiro * comissao) +  salarioFixo;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        nome = scan.next();
        
        System.out.print("Digite o salario fixo: ");
        salarioFixo = scan.nextDouble();
        
        System.out.print("Digite o total de vendas por mes: ");
        totalVendasDinheiro = scan.nextDouble();
        
        System.out.println("Relatorio");
        System.out.println("Nome: "+nome);
        System.out.println("Salario Fixo: "+salarioFixo);
        System.out.println("Total de vendas por mes: "+totalVendasDinheiro);
        System.out.println("Salario Final: "+salarioFinal(salarioFixo, totalVendasDinheiro));
  
    }
}
