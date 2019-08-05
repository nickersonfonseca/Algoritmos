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
public class Questao003 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int cont = num;
        int acum = 1;
        
        while (cont >= 1){
            acum = acum * cont;
            cont--;
        }
        
        System.out.println("O resultado de " + num + "! é: " + acum);
    }
    
}
