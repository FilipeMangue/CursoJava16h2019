/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercAula08.exercicio13;

/**
 *
 * @author Filipe Emanuel
 */
public class Pessoa {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String provincia;
    
    public void opcoes(){
        System.out.println("1 - Cadastrar Pessoa\n"
                         + "2 - Remover Pessoa"
                         + "3 - Modificar Pessoa]"
                         + "4 - Exibir Pessoa"
                         + "5 - Sair\n");
    }
}
