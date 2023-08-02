package gen_exemplos_das_aulas;

import java.util.Iterator;
import java.util.Scanner;

public class RepeticaoFor {

	
	public static void main(String[] args) {
		
		float n1, n2, n3, media, somamedia=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1 	; i<=4; i++) {
			System.out.println("Digite a Primeira nota: ");
			n1 = sc.nextFloat();
			System.out.println("Digite a Segunda nota: ");
			n2 = sc.nextFloat();
			System.out.println("Digite a Terceira nota: ");
			n3 = sc.nextFloat();
			
			media = (n1+n2+n3)/3;
			somamedia+= media;
			System.out.printf("Media aluno(a) %d foi de %.2f\n", i, media);
		}
		
		System.out.println("media geral da turma eh: " + (somamedia/4));
		
	}
	
	
	
}
