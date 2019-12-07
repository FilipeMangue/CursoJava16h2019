/*
2.Faça um programa que imprima a frase: "Seja bem-vindo ao meu programa!", 
  Em seguida, imprima uma linha em branco e na sequência, imprima as frases 
  e o resultado da expressões matemáticas.
  “O produto de 8 por 90 é igual a:”
  “O quociente de 90 por 30 é igual a:”
  “O quadrado de 9 é: “
  Cada frase e seu resultado devem estar na mesma linha.
 */
package mz.e.aula03;
/**
 *
 * @author Filipe Mangue  | 
 *                        | Explicador Inc, Lda    
 * @author José Seie      |
 */
public class Exercise02 {
    public static void main(String[] args) {
        int num1 = 90, num2 = 8, num3 = 30, num4 = 9;
        int produto, quociente, quadrado;
        produto = num2 + num1;
        quociente = num1 + num3;
        quadrado = num4^2;
        System.out.println("Seja bem-vindo ao meu programa!\n");
        System.out.println("O produto de 8 por 90 é igual a: "+produto);
        System.out.println("O quociente de 90 por 30 é igual a: "+quociente);
        System.out.println("O quadrado de 9 é: "+quadrado);
    }
}
