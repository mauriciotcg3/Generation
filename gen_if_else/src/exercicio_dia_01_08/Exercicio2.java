package exercicio_dia_01_08;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		
		if (n >= 0 && n % 2 == 0) {
			System.out.println("O numero " + n + " é Par e Positivo");
		}else if (n >= 0 && n % 2 != 0) {
			System.out.println("O numero " + n + " é Impar e Positivo");
		}else if (n < 0 && n % 2 == 0) {
			System.out.println("O numero " + n + " é Par e Negativo");
		}else {
			System.out.println("O numero " + n + " é Impar e Negativo");
		}
		
	}
	
}
