package gen_exemplos_das_aulas;

import java.util.Scanner;

public class RepeticaoDoWhile {

	public static void main(String[] args) {
		
		int tab, i=1, res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da tabuada: ");
		tab = sc.nextInt();
		
		do {
			res = tab * i;
			System.out.println(tab + " x " + i + " = " + res);
			i++;
		}while(i<=10);
	}
	
}
