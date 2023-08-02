package gen_switch;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int ope;
		float saldo = 1000, saque, deposito;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\tConta bancaria");
		System.out.print("1- Saldo\n2- Saque\n3- Deposito");
		ope = sc.nextInt();
		
		switch (ope) {
		
		case 1:
			
			System.out.println("-------------------------------");
			System.out.println("Operação Selecionada -> Saldo");
			System.out.println("Saldo da conta: " + saldo);
			System.out.println("-------------------------------");
			break;
			
		case 2:
			
			System.out.println("-------------------------------");
			System.out.println("Operação Selecionada -> Saque");
			System.out.print("Digite o Valor que Será Sacado: ");
			saque = sc.nextFloat();
			System.out.println("-------------------------------");
			if (saldo < saque) {
				System.out.println("Operação - Saque");
				System.out.println("Saldo Insuficiente para Saque");
				break;
			}
			
			saldo = saldo - saque;
			
			System.out.println("Saque Realizado Com Sucesso!");
			System.out.println("Operação - Saque");
			System.out.println("Saldo Atual da Conta: " + saldo);
			System.out.println("-------------------------------");
			break;
			
		case 3:
			
			System.out.println("-------------------------------");
			System.out.println("Operação Selecionada -> Deposito");
			System.out.print("Digite o Valor que Será Depositado: ");
			deposito = sc.nextFloat();
			
			System.out.println("-------------------------------");
			saldo = deposito + saldo;
			System.out.println("Deposito realizado com sucesso!");
			System.out.println("Operação - Deposito");
			System.out.println("Saldo Atual da Conta: " + saldo);
			System.out.println("-------------------------------");
			break;
			
		default:
			System.out.println("-------------------------------");
			System.out.println("Operação Invalida!");
			System.out.println("-------------------------------");
		}
	}
	
}
