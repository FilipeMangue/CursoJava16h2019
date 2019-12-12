/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercAula08;

/**
 *
 * @author Filipe Emanuel
 */
public class Lampada {
    String cor;
    boolean estado;
    String tipo;
    double voltagem;
    byte grauLuminosidade;

    public Lampada() {
    }
    
    public Lampada(String cor, boolean estado, String tipo, double voltagem, byte grauLuminosidade) {
        this.cor = cor;
        this.estado = estado;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.grauLuminosidade = grauLuminosidade;
    }
    
    public boolean ligar(){
        return true;
    }
    
    public boolean desligar(){
        return false;
    }
    
    public void estadoDaLuz(){
        if(this.estado = true){
            System.out.println("Luz Ligada");
        } else {
            System.out.println("Luz Desligada");
        }
    }
    
    public void lampadaFundida(int lampadaFundida){
        if(this.getGrauLuminosidade() > lampadaFundida){
            System.out.println("Lâmpada  Fundida"); 
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public byte getGrauLuminosidade() {
        return grauLuminosidade;
    }

    public void setGrauLuminosidade(byte grauLuminosidade) {
        this.grauLuminosidade = grauLuminosidade;
    }

    @Override
    public String toString() {
        return "Lampada{" + "cor=" + cor + ", estado=" + estado + ", tipo=" + tipo + ", voltagem=" + voltagem + ", grauLuminosidade=" + grauLuminosidade + '}';
    }
    
}
