/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercAula08.exercicio15;
/**
 *
 * @author Filipe Emanuel
 */
public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Kosman ", "Kolera", 20000);
        Empregado emp2 = new Empregado("Aslan", "Serra", 50000);
        
        System.out.println(emp1.getNome());
        System.out.println(emp2.getNome());
    }
}
