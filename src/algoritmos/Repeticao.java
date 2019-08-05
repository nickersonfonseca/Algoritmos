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
public class Repeticao {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);       
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int acum = 0;
        
        for (int cont = 0; cont < n1; cont++) {
            acum = acum + n2;
        }
        
        System.out.println("O resultado é:" + acum);
        
        
        
    }  
}
