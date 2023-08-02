package gen_switch;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String nome;
		int cargo;
		double sal, ajuste;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Nome: ");
		nome = sc.next();
		System.out.println("\tDigite o numero do cargo\n 1- Gerente\n 2- Vendedor\n 3- Supervisor\n 4- Motorista\n 5- Estoquista\n 6- Tecnico de TI");
		cargo = sc.nextInt();
		System.out.print("Digite o salario: ");
		sal = sc.nextFloat();
		
		switch (cargo) {
		case 1:
			ajuste = sal + (0.1 * sal);
			System.out.println("Nome: " + nome + "\nCargo: Gerente\nSalario Reajustado: " + ajuste);
			break;
		case 2:
			ajuste = sal + (0.07 * sal);
			System.out.println("Nome: " + nome + "\nCargo: Vendedor\nSalario Reajustado: " + ajuste);
			break;
		case 3:
			ajuste = sal + (0.09 * sal);
			System.out.println("Nome: " + nome + "\nCargo: Supervisor\nSalario Reajustado: " + ajuste);
			break;
		case 4:
			ajuste = sal + (0.06 * sal);
			System.out.println("Nome: " + nome + "\nCargo: Motorista\nSalario Reajustado: " + ajuste);
			break;
		case 5:
			ajuste = sal + (0.05 * sal);
			System.out.println("Nome: " + nome + "\nCargo: Estoquista\nSalario Reajustado: " + ajuste);
			break;
		case 6:
			ajuste = sal + (0.08 * sal);
			System.out.println("Nome: " + nome + "\nCargo: Técnico de TI\nSalario Reajustado: " + ajuste);
			break;
		default:
			System.out.println("Opção Invalida");
			break;
		}
		
	}
	
}
