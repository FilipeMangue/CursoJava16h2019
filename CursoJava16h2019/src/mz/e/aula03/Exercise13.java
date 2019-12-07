/*
    13.	Informar um saldo e imprimir o saldo com o aumento de 1%.
 */
package mz.e.aula03;

import java.util.Scanner;

/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo, saldo_aumento, percentagem = 0.01;

        System.out.print("Informe um saldo: ");
        saldo = scan.nextDouble();
        
        saldo_aumento = saldo + (saldo * percentagem);
        
        System.out.println("Saldo de normal: "+saldo+"\nSaldo com 1 por cento de aumento: "+saldo_aumento);
        
    }
}
