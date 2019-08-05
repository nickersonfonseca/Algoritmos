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
public class Questao15 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int acum = 0;
        
        while (num>=0){
            
            num = sc.nextInt();
            acum= acum + num;
            
        }
        
        System.out.println("A soma é: " + acum);
    }
    
}
