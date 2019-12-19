/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer04;

/**
 *
 * @author Filipe Emanuel
 */
public class CalculadoraBase {
    public double soma(double num1, double num2){
        return num1 + num2;
    }
    
    public double subtracao(double num1, double num2){
        return num1 - num2;
    }
    
    public double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    
    public double divisao(double num1, double num2){
        if (num2 == 0) return num2 / num1;
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        
    }
}
