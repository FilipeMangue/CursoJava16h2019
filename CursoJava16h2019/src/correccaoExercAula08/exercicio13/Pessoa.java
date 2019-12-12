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
    String nome;
    int ano_nasc;
    String endereco;

    public Pessoa() {
    }
    
    public Pessoa(String rua, int numero, String endereco, String cidade, String provincia) {
        this.nome = rua;
        this.ano_nasc = numero;
        this.endereco = endereco;
    }

    public String getRua() {
        return nome;
    }

    public void setRua(String rua) {
        this.nome = rua;
    }

    public int getNumero() {
        return ano_nasc;
    }

    public void setNumero(int numero) {
        this.ano_nasc = numero;
    }

    public String getBairro() {
        return endereco;
    }

    public void setBairro(String bairro) {
        this.endereco = bairro;
    }

    public String getCidade() {
        return endereco;
    }

    public void setCidade(String endereco) {
        this.endereco = endereco;
    }

    public void opcoes(){
        System.out.println("1 - Cadastrar Pessoa\n"
                         + "2 - Remover Pessoa"
                         + "3 - Modificar Pessoa]"
                         + "4 - Exibir Pessoa"
                         + "5 - Sair\n");
    }
}
