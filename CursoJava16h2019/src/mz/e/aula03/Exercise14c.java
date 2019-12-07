/*
 14.	Escreva uma classe ConversaoDeUnidadesDeTemperatura que contenha métodos estáticos para 
        calcular a conversão entre diferentes escalas de temperatura. Considere as fórmulas de conversão abaixo: 
    c)	De graus Celsius (C) para graus Kelvin (K): K = C + 273.15 
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Exercise14c {
    public static void main(String [] arg){
       Scanner scanner = new Scanner(System.in);
        double t_em_c, t_emK;
        
        System.out.print("Digite temperatura em Celsius: ");
        t_em_c = scanner.nextDouble();
        
        t_emK = t_em_c + 273.15;
        
        System.out.println("Temperatura em Kelvin: "+t_emK); 
    }
}
