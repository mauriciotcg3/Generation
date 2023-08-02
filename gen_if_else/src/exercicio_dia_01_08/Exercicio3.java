package exercicio_dia_01_08;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String nome;
		int idade, vali;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Seu Nome: ");
		nome = sc.next();
		System.out.print("Digite a Sua Idade: ");
		idade = sc.nextInt();
		System.out.print("Primeira vez doando sangue (sim = 1/nao = 0): ");
		vali = sc.nextInt();
		
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				if (vali == 1) {
					System.out.println(nome + " Não Esta Apto a Doar Sangue!");
				}else {
					System.out.println(nome + " Esta Apto a Doar Sangue!");
				}
			}else {
				System.out.println(nome + " Esta Apto a Doar Sangue!");
			}
		}else {
			System.out.println(nome + " Não Esta Apto a Doar Sangue!");
		}
	}
	
}
