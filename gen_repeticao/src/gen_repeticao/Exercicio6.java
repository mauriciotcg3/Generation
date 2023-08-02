package gen_repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		int  i = 0;
		float med = 0, n = 1, soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um Numero: ");
			n = sc.nextInt();
			
			if(n % 3 == 0 && n !=0 && n > 0) {
				soma += n;
				i++;
			}
			
		}while(n != 0);
		
		med = soma/i;
		
		System.out.println(med);
		
	}
	
}
