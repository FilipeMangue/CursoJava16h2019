/*
    7.	Faça um programa que leia os valores A e B. Mostre uma mensagem que informe se a soma
    de A com B e igual a A.
 */
package mz.e.aula03;

import javax.swing.JOptionPane;

/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise07 {
    public static void main(String[] args) {
        double a,b,soma;
        
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor A: "));
        
        soma = a + b;
        if (soma != a) {
            JOptionPane.showMessageDialog(null, "A Soma de A e B: "+soma+" não é igual a  A: "+a);
        } else {
            JOptionPane.showMessageDialog(null, "A Soma de A e B: "+soma+" é igual a  A: "+a);
        } 
    }
}
