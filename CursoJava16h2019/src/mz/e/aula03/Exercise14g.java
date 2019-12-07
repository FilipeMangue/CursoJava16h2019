/*
 14.	Escreva uma classe ConversaoDeUnidadesDeTemperatura que contenha métodos estáticos para 
        calcular a conversão entre diferentes escalas de temperatura. Considere as fórmulas de conversão abaixo: 
    g)	De graus Kelvin (K) para graus Rankine (R): R = K ∗ 1.8 
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exercise14g {
    public static void main(String [] arg){
       Scanner scanner = new Scanner(System.in);
        double t_emK, t_emRa;
        
        System.out.print("Digite temperatura em  Kelvin (K): ");
        t_emK = scanner.nextDouble();
        
        t_emRa = t_emK * 1.8;
        
        System.out.println("Temperatura em Rankine (R): "+t_emRa); 
    }
}
