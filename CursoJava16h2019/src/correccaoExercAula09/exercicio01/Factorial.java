/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercAula09.exercicio01;

/**
 *
 * @author Filipe Emanuel
 */
public class Factorial {
    public static float factorial(int n){
        if(n == 0)
            return (float) 1.0;
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        float fat;
        fat = factorial(6);
        System.out.println("Factorial de "+fat+" : "+fat);
    }
}
