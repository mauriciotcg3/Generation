package gen_repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int n = 1, soma = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um Numero: ");
			n = sc.nextInt();
			
			if(n % 2 == 0) {
				soma += n;
			}
			
		}while(n != 0);
		
		System.out.printf("A soma dos números positivos é: %d", soma);
		
	}
	
}
