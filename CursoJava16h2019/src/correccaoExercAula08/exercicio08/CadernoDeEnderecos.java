/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercAula08.exercicio08;

/**
 *
 * @author Filipe Emanuel
 */
public class CadernoDeEnderecos {
    String nome;
    String telefone;
    String email;
    byte data_nasc;
    String endereco;

    public CadernoDeEnderecos(String nome, String telefone, String email, byte data_nasc, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(byte data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
