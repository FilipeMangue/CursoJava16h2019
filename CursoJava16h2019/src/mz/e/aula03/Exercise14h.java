/*
 14.	Escreva uma classe ConversaoDeUnidadesDeTemperatura que contenha métodos estáticos para 
        calcular a conversão entre diferentes escalas de temperatura. Considere as fórmulas de conversão abaixo: 
    h)	De graus Rankine (R) para graus Kelvin (K): K = R/1.8
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exercise14h {
    public static void main(String [] arg){
       Scanner scanner = new Scanner(System.in);
        double t_emK, t_emRa;
        
        System.out.print("Digite temperatura em  Rankine (R): ");
        t_emRa = scanner.nextDouble();
        
        t_emK = t_emRa / 1.8;
        
        System.out.println("Temperatura em Kelvin (K): "+t_emK); 
    }
}
