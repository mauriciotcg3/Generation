package gen_vetor_e_matriz;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int [][] num = new int [3][3];
		int principal[] = new int[3], secundaria[] = new int[3];
		int dgp = 0, dgs = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int l = 0; l < num.length; l++) {
			for (int c = 0; c < num[l].length; c++) {
				System.out.println("Digite um numero: ");
				num[l][c] = sc.nextInt();	
			}
			
			principal[l] = num[l][l];
			secundaria[l] = num[l][3 - 1 -l];
			
		}
		
		for (int i = 0; i < 3; i++) {
			dgp += num[i][i];
			dgs += num[3 - 1 - i][i];
		}
		
		System.out.println("Elementos da Diagonal Principal:");
		for (int i = 0; i < 3; i++) {
			System.out.print(principal[i]+" ");	
		}
		
		System.out.println("\nElementos da Diagonal Secundaria:");
		for (int i = 0; i < 3; i++) {
			System.out.print(secundaria[i]+" ");	
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + dgp);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + dgs);
		
		
		
	}
	
}
