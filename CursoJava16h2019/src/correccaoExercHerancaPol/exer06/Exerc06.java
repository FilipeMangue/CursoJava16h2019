/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer06;

/**
 *
 * @author Filipe Mangue
 */
public class Exerc06 {
    String nome;
    double salarioFixo;
    double totalVendasDinheiro;
    static double comissao = 0.15;
    
    public static double salarioFinal(double salarioFixo, double totalVendasDinheiro){
        return (totalVendasDinheiro * comissao) +  salarioFixo;
    }
    
    public static void main(String[] args) {
        
    }
}
