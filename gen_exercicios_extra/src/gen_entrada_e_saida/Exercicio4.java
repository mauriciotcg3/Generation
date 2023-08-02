package gen_entrada_e_saida;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, dif;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro Numero: ");
		n1 = sc.nextFloat();
		System.out.print("Digite o Segundo Numero: ");
		n2 = sc.nextFloat();
		System.out.print("Digite o Terceiro Numero: ");
		n3 = sc.nextFloat();
		System.out.print("Digite o Quarto Numero: ");
		n4 = sc.nextFloat();
		
		dif = (n1*n2) - (n3*n4);
		
		System.out.println("Diferença do Produto: " + dif);
	}
	
}
