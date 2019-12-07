package olamundo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Filipe Emanuel
 */
public class HelloFilipe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resp;
        System.out.println("Olá Filipe Mangue!\nTudo Bem?");
        resp = scan.next();
        if("nao".equals(resp.toLowerCase()) ){
            System.out.println("O que se passa?");
        } else {
            String r;
            System.out.println("Conta me uma novidade?");
            r = scan.next();
            if("nao tenho".equals(resp.toLowerCase())) {
                System.out.print(r);
            }
        }
    }
}
