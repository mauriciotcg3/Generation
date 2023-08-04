package gen_vetor_e_matriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int [] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		n = sc.nextInt();
		
		for(int i = 0; i< numeros.length; i++) {
			
			if(numeros[i] == n) {
				System.out.printf("O Numero %d está localizado na posição: %d", n, i+1);
				break;
			}else if(i == numeros.length-1){
				System.out.println("O numero " + n + " não foi encontrado!");
			}
			
		}
		
		
	}
	
}
