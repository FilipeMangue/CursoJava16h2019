
package correccaoExercAula09.exercicio01;

import java.util.Scanner;

/**
 *
 * @author Filipe Emanuel
 */
public class Factorial {
    public static float factorial(int n){
        if(n == 0){
            return 1;   
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        float fat, res;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Valor Para a Calcular Factorial: ");
        fat = scanner.nextInt();
        
        res = factorial((int) fat);
        
        System.out.println("Factorial de "+fat+" : "+res);
    }
}
