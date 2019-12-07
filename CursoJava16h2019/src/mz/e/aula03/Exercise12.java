/*
    12.	Fazer um programa que imprima a média aritmética dos números 8,9 e 7. 
        A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
package mz.e.aula03;

/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise12 {
    public static void main(String[] args) {
        double soma1, soma2, media1, media2, media_das_medias;
        
        soma1 = 8 + 9 + 7;
        soma2 = 4 + 5 + 6;
        
        media1 = soma1/3;
        media2 = soma2/3;
        
        media_das_medias = (media1 + media2)/2;
        
        System.out.println("A média1: "+media1+", média2: "+media2+" e a média das médias: "+media_das_medias);
    }
}
