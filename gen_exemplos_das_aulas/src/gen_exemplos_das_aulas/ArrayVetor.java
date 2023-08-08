package gen_exemplos_das_aulas;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		float n1, n2, n3, somaMedia = 0;
		float [] media = new float [4];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < media.length; i++) {
			
			System.out.println("Digite a Primeira Nota: ");
			n1 = sc.nextFloat();
			System.out.println("Digite a Segunda Nota: ");
			n2 = sc.nextFloat();
			System.out.println("Digite a Terceira Nota: ");
			n3 = sc.nextFloat();

			media[i] = (n1 + n2 + n3)/3;
			
			System.out.println("A media do aluno " + i + " eh: " + media[i]);
			somaMedia += media[i];
		}

		System.out.println("Media geral da sala: " + (somaMedia/media.length));
		
	}
	
}
