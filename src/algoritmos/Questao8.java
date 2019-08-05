/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author ferreira
 */
public class Questao8 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        int cont18 = 0;
        
        for (int cont = 0; cont < 5; cont++) {
            
            idade = sc.nextInt();
            if (idade >= 18){
                cont18++;
            }
        }
        
        System.out.println("Você informou " + cont18 + " pessoas maiores de idade.");
        
        
    }
    
}
