/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer04;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class CalculadoraBase {
    public static double soma(double num1, double num2){
        return num1 + num2;
    }
    
    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }
    
    public static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    
    public static double divisao(double num1, double num2){
        if (num2 == 0) return num2 / num1;
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        double num1, num2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o num1: ");
        num1 = scan.nextDouble();
        
        System.out.print("Digite o num1: ");
        num2 = scan.nextDouble();
        
        System.out.println("Soma: "+soma(num1,num2));
        System.out.println("Subtracao: "+subtracao(num1,num2));
    }
}
