/*
 14.	Escreva uma classe ConversaoDeUnidadesDeTemperatura que contenha métodos estáticos para 
        calcular a conversão entre diferentes escalas de temperatura. Considere as fórmulas de conversão abaixo: 
    e)	De graus Celsius (C) para graus Réaumur (Re): Re = C ∗ 4/5 
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exercise14e {
    public static void main(String [] arg){
       Scanner scanner = new Scanner(System.in);
        double t_em_c, t_emK;
        
        System.out.print("Digite temperatura em  Kelvin: ");
        t_emK = scanner.nextDouble();
        
        t_em_c = t_emK - 273.15;
        
        System.out.println("Temperatura em Celsius: "+t_em_c); 
    }
}
