package algoritmos;

import java.util.Scanner;

public class TestePrimo {
	public static void main(String[] args) {
		int n1, n2;
		boolean ehPrimo = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Este progama serve para imprimir n�meros primos em um intervalo caso exist�o");
		System.out.println("Digite o valor do primeiro n�mero");
		n1 = in.nextInt();
		System.out.println("Digite o valor do segundo n�mero(Lembre-se que o 2� deve ser maior que o primerio)");
		n2 = in.nextInt();
		for (int i = n1 + 1; i < n2; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i != j) {
                                    ehPrimo = false;
				}

			}
                        
                        if (ehPrimo){
                            System.out.println("i: " + i);
                        }
                        ehPrimo = true;

		} // fim do for
                
                System.out.println("FIM");

	}// fim do main

}
