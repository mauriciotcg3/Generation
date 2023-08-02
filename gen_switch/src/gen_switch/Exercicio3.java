package gen_switch;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float n1, n2, res;
		int ope;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextFloat();
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextFloat();
		System.out.println("Escolha a Operação Aritimetica\n1- Adição\n2- Subtração\n3- Multiplicação\n4- Divisão");
		ope = sc.nextInt();
		
		switch (ope) {
		case 1:
			res = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + res);
			break;
		case 2:
			res = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + res);
			break;
		case 3:
			res = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + res);
			break;
		case 4:
			res = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + res);
			break;
		default:
			System.out.println("Operação Invalida!");
		}
		
	}
	
}
