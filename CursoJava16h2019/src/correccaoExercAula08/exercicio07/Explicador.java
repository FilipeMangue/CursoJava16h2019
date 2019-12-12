/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercAula08.exercicio07;

/**
 *
 * @author Filipe Emanuel
 */
public class Explicador {
    private String nomeUsuario;
    private int dataNasc;
    private String email;
    private String codigoVisita;

    public Explicador(String nomeUsuario, int dataNasc, String email, String codigoVisita) {
        this.nomeUsuario = nomeUsuario;
        this.dataNasc = dataNasc;
        this.email = email;
        this.codigoVisita = codigoVisita;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoVisita() {
        return codigoVisita;
    }

    public void setCodigoVisita(String codigoVisita) {
        this.codigoVisita = codigoVisita;
    }

}
