/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.prova.tenteoutravez;

import java.util.Scanner;

/**
 *
 * @author ferreira
 */
public class Prova003 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite a quantidade de diárias: ");
        int qtd = sc.nextInt();
        
        double taxa =0.0;
        
        if (qtd>15){
            taxa = 5.5 * qtd;
        } else if (qtd == 15){
            taxa = 6 * qtd;
        } else {
            taxa = 8 * qtd;
        }
        
        double total = 60 * qtd + taxa;
        
        System.out.println("Cliente: " + nome + "; Total a pagar: " + total);
        
        
    }
    
}
