/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercAula08.exercicio11;

/**
 *
 * @author Filipe Emanuel
 */
public class Circulo {
    double raio;
    double x;
    double y;
    double PI;

    public Circulo(double raio, double x, double y, double PI) {
        this.raio = raio;
        this.x = x;
        this.y = y;
        this.PI = PI;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }
}
