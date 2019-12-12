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

    public Pessoa() {
    }
    
    public Pessoa(String rua, int numero, String bairro, String cidade, String provincia) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.provincia = provincia;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
        
    public void opcoes(){
        System.out.println("1 - Cadastrar Pessoa\n"
                         + "2 - Remover Pessoa"
                         + "3 - Modificar Pessoa]"
                         + "4 - Exibir Pessoa"
                         + "5 - Sair\n");
    }
}
