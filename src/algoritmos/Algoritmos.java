package algoritmos;

import java.util.Scanner;

public class Algoritmos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if (idade < 16) {
            
            System.out.println("Não vota!");
            
        } else {
            
            if (idade <= 18) {
                System.out.println("Opcional");

            } else {
                
                if (idade < 65){
                    System.out.println("Obrigatório");
                } else {
                    System.out.println("Opcional");
                }
                
            }
        }
        
        System.out.println("fim");
    }
}