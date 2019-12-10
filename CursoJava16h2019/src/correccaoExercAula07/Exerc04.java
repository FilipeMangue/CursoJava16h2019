/*
2. Faça um programa que copie o conteúdo de um array para um segundo array.
 */
package correccaoExercAula07;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc04 {
    public static void main(String[] args) {
        String [] a = new String []{"José","Filipe","Mutole","Uaeca","Aly"};
        String [] b = new String [5];
        
        for (int i = 0; i < 5; i++) {
            b[i] = a[i];
            System.out.println(" "+b[i]);
        }
    }
}
