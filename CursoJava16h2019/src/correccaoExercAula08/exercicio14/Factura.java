/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercAula08.exercicio14;

/**
 *
 * @author Filipe Emanuel
 */
public class Factura {
    String numero;
    String descricao;
    int qtdComprada;
    double precoPorItem;

    public Factura(String numero, String descricao, int qtdComprada, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdComprada = qtdComprada;
        this.precoPorItem = precoPorItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }
  
    
}
