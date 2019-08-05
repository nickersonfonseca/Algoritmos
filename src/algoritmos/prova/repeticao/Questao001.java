/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.prova.repeticao;

import java.util.Scanner;

/**
 *
 * @author ferreira
 */
public class Questao001 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        System.out.println("Digite o seu nome: ");
        String nome = sc.next();
        
        int cont = 0;
        
        while (cont < n){
            System.out.println(nome);
            cont++;
        }
        
        System.out.println("####################################");
        
        for (int cont2 = 0; cont2 < n; cont2++) {
            System.out.println(nome);
        }
        
        System.out.println("####################################");
        
        int cont3=0;
        
        do {
            
            System.out.println(nome);
            cont3++;
        } while (cont3 < n);
        
        
        
    }
    
    
}
