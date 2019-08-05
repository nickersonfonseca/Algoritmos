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
public class Prova002 {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        String conta = sc.next();
        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.println("Digite o tipo da operação \n (1- depósito ou 2 - retirada): ");
        int operacao = sc.nextInt();
        System.out.println("Digite o valor da operação: ");
        double valor = sc.nextDouble();
        
        if (operacao == 1){
            saldo = saldo + valor;
        } else if (operacao == 2){
            saldo = saldo - valor;
        } else {
            System.out.println("Operação inválida.");
        }
        if (saldo < 0){
            System.out.println("Conta estourada!");
        } else {
        
            System.out.println("Seu novo saldo é: " + saldo);
        }
    }
    
}
