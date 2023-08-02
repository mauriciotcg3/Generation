package gen_entrada_e_saida;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float sal, abono, novosal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salario: ");
		sal = sc.nextFloat();
		System.out.print("Digite o abono: ");
		abono = sc.nextFloat();
		
		novosal = sal + abono;
		
		System.out.println("Novo salario: " + novosal);
		
	}
	
}
