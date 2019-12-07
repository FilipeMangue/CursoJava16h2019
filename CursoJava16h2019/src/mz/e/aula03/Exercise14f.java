/*
 14.	Escreva uma classe ConversaoDeUnidadesDeTemperatura que contenha métodos estáticos para 
        calcular a conversão entre diferentes escalas de temperatura. Considere as fórmulas de conversão abaixo: 
    f)	De graus Réaumur (Re) para graus Celsius (C): C = Re ∗ 5/4 
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exercise14f {
    public static void main(String [] arg){
       Scanner scanner = new Scanner(System.in);
        double t_em_c, t_emRe;
        
        System.out.print("Digite temperatura em  Réaumur (Re): ");
        t_emRe = scanner.nextDouble();
        
        t_em_c = t_emRe * 5/4;
        
        System.out.println("Temperatura em Celsius (C): "+t_em_c); 
    }
}
