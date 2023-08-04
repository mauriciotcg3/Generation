package gen_vetor_e_matriz;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float [][] notas = new float[10][4];
		float [] media = new float [10];
		
		Scanner sc = new Scanner(System.in);
		
		for (int l = 0; l < notas.length; l++) {
			
			for (int c = 0; c < notas[l].length; c++) {
				
				System.out.println("Digite a " + (c+1) + "º nota do Aluno: " + (l+1));
				notas[l][c] = sc.nextInt();	
			}
			
			media[l] = (notas[l][0] + notas[l][1] + notas[l][2] + notas[l][3]) / 4;
			
		}
		
		System.out.println("Media Dos Alunos:");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Aluno " + (i+1) + " - Media: " + media[i]);	
		}
		
	}
	
}
