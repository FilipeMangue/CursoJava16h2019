/*
12. Ler um array A com 10 elementos inteiros correspondentes as idades 
    de um grupo de pessoas. Escreva um programa que determine e escreva 
    a menor e a maior idades e suas respectivas posições. 
 */
package correccaoExercAula07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc12 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] idades = new int[10];
        int qtd_idade = 0, posicaoMaiorIdade = 0,posicaoMenorIdade = 0, maiorIdade = 0, menorIdade = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a Idade ("+i+"): ");
            idades[i] = Integer.parseInt(br.readLine());
            if(maiorIdade > idades[i]) {
                maiorIdade = idades[i];
                posicaoMaiorIdade = i;
            }
            if (menorIdade < idades[i]) {
                menorIdade = idades[i];
                posicaoMenorIdade = i;
            }
        }
        System.out.println("Maior Idade: "+maiorIdade+" na posicao: "+posicaoMaiorIdade);
        System.out.println("Menor Idade: "+menorIdade+" na posicao: "+posicaoMenorIdade);
        
    }
}
