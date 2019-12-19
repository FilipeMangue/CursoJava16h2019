/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer05;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class ConsumoMedio {
    public static double consumoMedio(double distancia, double combustivel){
        return distancia * combustivel;
    }
    
    public static void main(String[] args) {
        double distancia, combustivel;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distancia total: ");
        distancia = scanner.nextDouble();
        
        System.out.print("Digite total de combustivel: ");
        combustivel = scanner.nextDouble();
        
        System.out.println("Consumo medio e de "+consumoMedio(distancia,combustivel));
    }
}
