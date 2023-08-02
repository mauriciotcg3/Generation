package gen_switch;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int prod, qntd, valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Numero de 1 a 6: ");
		prod = sc.nextInt();
		System.out.println("Digite a Quantidade do Produto: ");
		qntd = sc.nextInt();
		
		switch (prod) {
			case 1: 
				valor = qntd * 10;
				System.out.println("Produto escolhido: Cachorro Quente");
				System.out.println("Valor Total: " + valor);
				break;
			case 2:
				valor = qntd * 15;
				System.out.println("Produto escolhido: X-Salada");
				System.out.println("Valor Total: " + valor);
				break;
			case 3: 
				valor = qntd * 18;
				System.out.println("Produto escolhido: X-Bacon");
				System.out.println("Valor Total: " + valor);
				break;
			case 4: 
				valor = qntd * 12;
				System.out.println("Produto escolhido: Bauru");
				System.out.println("Valor Total: " + valor);
				break;
			case 5: 
				valor = qntd * 8;
				System.out.println("Produto escolhido: Refrigerante");
				System.out.println("Valor Total: " + valor);
				break;
			case 6:
				valor = qntd * 13;
				System.out.println("Produto escolhido: Suco de laranja");
				System.out.println("Valor Total: " + valor);
				break;
			default:
				System.out.println("Opção Invalida");
				break;
		}
		
	}
	
}
