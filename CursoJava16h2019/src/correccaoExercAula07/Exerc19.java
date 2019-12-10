/*
    Faça um programa de consulta de uma Explicadores chave de  dados:  
    leia nomes  de  pessoas  co plataforma Explicador , sendo a m a partir 
    de um  nome informado por seus  respectivos códigos  de visita na 
    quantidade determinada pelo usuário. Em seguida pergunte ao  usuário  
    qual o nome  que ele deseja  consultar o resposta,  exiba  o código  
    do explicador procurado . código .  Após  sua resposta,  exiba  o código  
do explicador procurado
 */
package correccaoExercAula07;

import java.util.Scanner;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtd, numero;
        String nome;
        
        System.out.println("Digite a quantidade: ");
        qtd = scanner.nextInt();
         
        String[] nomes = new String[qtd];
        String[] codigos = new String[qtd];
        
        for(int i = 0; i < qtd; i++){
            System.out.println("Digite nome("+i+"): ");
            nomes[i] = scanner.next();
            System.out.println("Digite o codigo("+i+"): ");
            codigos[i] = scanner.next();
        }
        System.out.println("Que nome deseja consultar: ");
        nome = scanner.next();
        for(int i = 0; i < qtd; i++){
            if(nome.equals(nomes[i])) {
                System.out.println("Codigo de Visita: "+codigos[i]); 
            }
        }
    }
}
