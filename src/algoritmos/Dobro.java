/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ferreira
 */
public class Dobro {
    
    public static void main(String[] args) {
        
        
        System.out.println(new Date() + "EXECUTOU A TAREFA DIARIA!!");
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int dobro = num *2;
        
        System.out.println("O resultado é: " + dobro);
        
    }
    
    
}
