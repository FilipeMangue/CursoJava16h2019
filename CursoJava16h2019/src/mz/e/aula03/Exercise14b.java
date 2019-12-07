/*
 14.	Escreva uma classe ConversaoDeUnidadesDeTemperatura que contenha métodos estáticos para 
        calcular a conversão entre diferentes escalas de temperatura. Considere as fórmulas de conversão abaixo: 
    b)	De graus Fahrenheit (F) para graus Celsius (C): C = (F − 32) × +5/9 
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exercise14b {
    public static void main(String [] arg){
       Scanner scanner = new Scanner(System.in);
        double t_em_c, t_em_fahr;
        
        System.out.print("Digite temperatura em Fahreiheit: ");
        t_em_fahr = scanner.nextDouble();
        
        t_em_c = (t_em_fahr - 32) * 5/9;
        
        System.out.println("Temperatura em Celsius: "+t_em_c); 
    }
}
