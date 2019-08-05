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
public class Questao002 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 0;        
        int contagem = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            n = sc.nextInt();
            if (n >= 0 && n<=100){
                contagem++;
            }
            
        }
        System.out.println("A quentidade de números é: " + contagem);
        
    }
}
