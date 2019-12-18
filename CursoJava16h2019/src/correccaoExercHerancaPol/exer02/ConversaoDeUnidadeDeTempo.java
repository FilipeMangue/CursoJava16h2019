/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer02;

import java.util.Scanner;

/**
 *
 * @author FILIPE MANGUE   -    Who am I?
 *         Business Simulation BootCamp Monitor - ITIS
           Computer Engineering Student - UEM
           Member of the Innovative Informatics Group (Department of Projects and Innovation, NEEN-UEM)
           Intern Developer/Ambassador - Explicador Inc, Lda
 *         
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
        Scanner scan = new Scanner(System.in);
        double numero, dia, mes, ano, semana, hora, minuto;
        
        System.out.println("1 - Minuto para Segundos\n" +
                             "2 - Dia para Minutos\n" +
                             "3 - Dia para Horas\n" +
                             "4 - Semana para Dias\n" +
                             "5 - Mês para Dias \n" +
                             "6 - Ano para Dias\n" + 
                             "Escolha a Opção do Seu Interesse:");
        numero = scan.nextInt();
        
        switch((int)numero){
            case 1:
                System.out.println("Digite o número em minuto(s): ");
                minuto = scan.nextInt();
                System.out.println(minuto+"minuto(s) tem "+minutoParaSegundo(minuto)+" segundos.");
                break;
            case 2:
                System.out.println("Digite o número em hora(s): ");
                hora = scan.nextInt();
                System.out.println(hora+"dis(s) tem "+horaParaMinutos(hora)+" minuto(s).");
                break;
            case 3:
                 System.out.println("Digite o número em dia(s): ");
                dia = scan.nextInt();
                System.out.println(dia+"dis(s) tem "+diaParaHoras(dia)+" hora(s).");
                break;
            case 4:
                System.out.println("Digite o número em semana(s): ");
                semana = scan.nextInt();
                System.out.println(semana+"semana(s) tem "+semanaParaDias(semana)+" dia(s).");
                break;
            case 5:
                System.out.println("Digite o número em mes(es): ");
                mes = scan.nextInt();
                System.out.println(mes+"minuto(s) tem "+mesParaDias(mes)+" dia(s).");
                break;
            case 6:
                System.out.println("Digite o número em ano(s): ");
                ano = scan.nextInt();
                System.out.println(ano+"minuto(s) tem "+anoParaDias(ano)+" dia(s).");
                break;
            default: System.out.println("A opção digitada não existe.");
                    
        }
    }
}
