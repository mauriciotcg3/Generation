package gen_entrada_e_saida;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a Primeira Nota: ");
		n1 = sc.nextFloat();
		System.out.print("Digite a Segunda Nota: ");
		n2 = sc.nextFloat();
		System.out.print("Digite a Terceira Nota: ");
		n3 = sc.nextFloat();
		System.out.print("Digite a Quarta Nota: ");
		n4 = sc.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("Media Final do Aluno(a) eh: " + media);
		
	}
	
}
