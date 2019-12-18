/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer02;

/**
 *
 * @author Filipe Emanuel
 */
public class ConversaoDeUnidadeDeTempo {
    public static double minutoParaSegundo(double numero){
        return numero * 60;
    }
    
    public static double horaParaMinutos(double numero){
        return numero * 60;
    }
    
    public static double diaParaHoras(double numero){
        return numero * 24;
    }
    
    public static double semanaParaDias(double numero){
        return numero * 7;
    }
    
    public static double mesParaDias(double numero){
        return numero * 30;
    }
    
    public static double anoParaDias(double numero){
        return numero * 365.25;
    }
    
    public static void main(String[] args) {
        System.out.println("Escolha a Opção do Seu Interesse:");
    }
}
