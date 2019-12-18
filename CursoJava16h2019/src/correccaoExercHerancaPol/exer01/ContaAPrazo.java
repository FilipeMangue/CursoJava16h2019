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
public class ContaAPrazo {
     String titular;
     double saldo;
     
     public void definirSaldoInicial(double saldo){
         this.saldo = saldo;
     }
     
     public void levantar(double valor){
         this.saldo = saldo - valor;
     }
     
     public void depositar(double valor){
         this.saldo = saldo + valor;
     }
     
     public double getSaldo(){
         return saldo;
     }
}
