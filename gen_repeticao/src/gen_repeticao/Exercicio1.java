package gen_repeticao;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {

	
	public static void main(String[] args) {
		
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o Primeiro Numero: ");
		n1 = sc.nextInt();
		System.out.println("Insira o Segundo Numero: ");
		n2 = sc.nextInt();
		
		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {

				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " eh Multiplo de 3 e 5!");
				}
				
			}
		}else {	
			System.out.println("Intervalo Invalido!");
		}
		
	}
	
}
