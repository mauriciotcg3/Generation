package gen_repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade = 1, menor = 0, maior = 0;
		Scanner sc = new Scanner(System.in);
		
		while(idade > 0) {
			
			System.out.println("Digite uma Idade: ");
			idade = sc.nextInt();
			
			if (idade < 21 && idade > 0) {
				menor++;
			}else if(idade > 50){
				maior++;
			}else {
				break;
			}
			
		}
		
		System.out.println("Total de Pessoas Menores de 21 Anos: " + menor);
		System.out.println("Total de Pessoas Maiores de 50 Anos: " + maior);
		
	}
	
}
