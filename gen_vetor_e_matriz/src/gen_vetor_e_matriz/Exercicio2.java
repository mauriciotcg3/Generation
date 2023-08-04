package gen_vetor_e_matriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float [] numeros = new float[10];
		float soma = 0, media = 0;
		int contp = 0, conti = 0;
		int [] par = new int[numeros.length];
		int [] impar = new int[numeros.length];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
		
			System.out.println("Digite o " + (i+1) +"º Numero: ");
			numeros[i] = sc.nextInt();
			
			
			if (numeros[i] % 2 == 0) {
				par[contp] = (int) numeros[i];
				contp++;
			}
			
			if(i % 2 != 0){
				impar[conti] = (int) numeros[i];
				conti++;
			}
			
			soma += numeros[i];
			media = soma/numeros.length;
			
		}
		
		System.out.println("Elementos nos índices ímpares: ");
		for (int i = 0; i < conti; i++) {
			System.out.print(impar[i]+", ");
			
		}
		
		System.out.println("\nElementos Pares: ");
		for (int i = 0; i < contp; i++) {
			System.out.print(par[i]+", ");
			
		}
		
		System.out.println("\nA Soma Dos Numeros eh: " + soma);
		System.out.println("A Media Dos Numeros eh: " + media);
	}
	
}
