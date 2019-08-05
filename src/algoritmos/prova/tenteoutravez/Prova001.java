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
public class Prova001 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de veiculos vendidos: ");
        int qtd = sc.nextInt();
        System.out.println("Digite o valor total de vendas: ");
        double venda = sc.nextDouble();
        
        double sm = 998.0;
        
        double total = (2 * sm) + (50 * qtd) + (venda * 0.05);
        
        System.out.println("O seu salário total é: " + total);
        
   
    }
    
    
}
