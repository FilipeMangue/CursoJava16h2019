/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccaoExercHerancaPol.exer03;

/**
 *
 * @author Filipe Emanuel
 */
public class Aluno {
    String estado;
    double media;
    
    public String estadoAluno(){
        if(media > 6)
            return estado = "Aprovado";
        if(media > 4 && media < 6)
            return estado = "Candidato ao Exame";
        if(media < 4)
            return estado = "Reprovado";
        return estado;
    }
    
    public static void main(String[] args) {
        
    }
}
