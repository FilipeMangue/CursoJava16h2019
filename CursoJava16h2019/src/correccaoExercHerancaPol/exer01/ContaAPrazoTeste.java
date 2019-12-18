/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer01;

/**
 *
 * @author Filipe Emanuel
 */
public class ContaAPrazoTeste {
    public static void main(String[] args) {
       ContaAPrazo conta = new ContaAPrazo();
       
       conta.definirSaldoInicial(5000);
       
       System.out.println("Saldo Inicial: "+conta.getSaldo());
       
       conta.levantar(500);
       
       conta.depositar(100);
       
        System.out.println("Saldo depois de levanter 500.00 MZN e depositar 100.00 MZN: "+conta.getSaldo());
        
        conta.levantar(1200);
        
        System.out.println("Saldo depois de levanter + 1,200.00 MZN: "+conta.getSaldo());
    }
}
