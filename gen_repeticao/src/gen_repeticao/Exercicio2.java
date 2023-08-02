package gen_repeticao;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int n, par = 0, impar = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i<=10; i++) {
			System.out.printf("Digite o %dº Numero: ", i);
			n = sc.nextInt();
			
			if (n % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
		}
		
		System.out.printf("Total de Numeros Pares: %d\n", par);
		System.out.printf("Total de Numeros Impares: %d", impar);
		
	}
	
}
