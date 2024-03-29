/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercAula08;

/**
 *
 * @author Filipe Mangue
 */
public class Lampada {
    String cor;
    boolean estado;
    String tipo;
    double voltagem;
    byte grauLuminosidade;

    
    public Lampada(String cor, boolean estado, String tipo, double voltagem, byte grauLuminosidade) {
        this.cor = cor;
        this.estado = estado;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.grauLuminosidade = grauLuminosidade;
    }
    
    public boolean ligar(int grauLuminosidade){
        if (grauLuminosidade > 100){
            estado = false;
        }
        return estado;
    }
    
    public boolean desligar(int grauLuminosidade){
         if (grauLuminosidade > 100){
            estado = false;
        }
        return estado;
    }
    
    public void estadoDaLuz(boolean estado){
        if(estado == true){
            System.out.println("Luz Ligada");
        } else if(estado == false) {
            System.out.println("Luz Desligada");
        }
    }
    
    public void lampadaFundida(){
        if(this.getGrauLuminosidade() > 100){
            System.out.println("Lâmpada Fundida"); 
        } else if (this.grauLuminosidade <= 0) {
            System.out.println("Lâmpada Não Fundida");
        }
    }
    
    public static void verificaVoltagem(Lampada lamp1, Lampada lamp2){
        if(lamp1.getVoltagem() == lamp2.getVoltagem()){
            System.out.println("As Lâmpadas tem a mesma voltagem");
        } else {
            System.out.println("As Lâmpadas não tem a mesma voltagem");
        }
    }
    
    public static void igualidadeDeLampadas(Lampada lamp1, Lampada lamp2){
        if(lamp1 == lamp2){
            System.out.println("As Lâmpadas são iguais.");
        } else {
            System.out.println("As Lâmpadas não são iguais.");
        }
    }
    
    public void aumentarLumin(){
        setGrauLuminosidade((byte) (this.grauLuminosidade + 5));
    }
    
    public void diminuirLumin(){
        setGrauLuminosidade((byte) (this.grauLuminosidade - 5));
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
    
    public boolean ligarLuz(){
        return estado = true;
    }
    
    public boolean desligarLuz(){
        return estado = false;
    }

    @Override
    public String toString() {
        return "Lâmpada [" + "\nCor: " + cor + ", \nEstado: " + estado + ", \nTipo: " + tipo + ", \nVoltagem: " + voltagem + ", \nGrau de Luminosidade: " + grauLuminosidade + ']';
    }
    
}
