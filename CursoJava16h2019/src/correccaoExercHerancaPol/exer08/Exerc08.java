/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer08;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exerc08 {
    static double valorEmDolar, qtdValorEmDolar;
    
    public static double convertor(double  valorEmDolar, double qtdValorEmDolar){
        return  valorEmDolar * qtdValorEmDolar;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da cotacao em dolar: ");
        valorEmDolar = scan.nextDouble();
        
        System.out.println("Digite o valor da cotacao em dolar: ");
        qtdValorEmDolar = scan.nextDouble();
        
        System.out.println("Valor em meticais: "+convertor(valorEmDolar,qtdValorEmDolar));
    }
}
