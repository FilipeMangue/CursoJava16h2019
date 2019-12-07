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
        double t_em_c, t_em_Reumur;
        
        System.out.print("Digite temperatura em Celsius: ");
        t_em_c = scanner.nextDouble();
        
        t_em_Reumur = t_em_c * 4/5;
        
        System.out.println("Temperatura em Réaumur (Re): "+t_em_Reumur); 
    }
}
