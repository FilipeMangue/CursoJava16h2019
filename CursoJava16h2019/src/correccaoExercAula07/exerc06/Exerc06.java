/*
 4. Faça um programa que faça a união de dois arrays de mesmo tamanho 
    e mesmo tipo em um terceiro array com dobro do tamanho. 
 */
package correccaoExercAula07.exerc06;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc06 {
    public static void main(String[] args) {
        int [] a = new int []{5,5,5,5,5,5,5,5};
        int [] b = new int []{1,1,1,1,1,1,1,1};
        int [] c = new int [16];
        
        for (int i = 0; i < 8; i++) {
            c[i] = a[i];
            if(i == 8){
                for (int j = 0; j < 8; j++) {
                    c[j+7] = b[j];
                }
            }
        }
        for (int i = 0; i < 16; i++) {
            System.out.println(""+c[i]);
        }
    }
}
