/*
 14.	Escreva uma classe ConversaoDeUnidadesDeTemperatura que contenha métodos estáticos para 
        calcular a conversão entre diferentes escalas de temperatura. Considere as fórmulas de conversão abaixo: 
    a)	De graus Celsius (C) para graus Fahrenheit (F): F = (9 × C/5) + 32) 
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exercise14a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t_em_c, t_em_fahr;
        
        System.out.print("Digite temperatura em Celsius: ");
        t_em_c = scanner.nextDouble();
        
        t_em_fahr = (9 * t_em_c/5) + 32;
        
        System.out.println("Temperatura em Fahreiheit: "+t_em_fahr);
    }
}
