package gen_ProjetoBanco;

import java.util.Scanner;
import gen_ProjetoBanco.util.Cores;
import gen_ProjetoBanco.model.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op;
		
	
		
		while (true) {

			System.out.println(Cores.TEXT_PURPLE + "=====================================================" + Cores.TEXT_RESET);
			System.out.println("                                                     ");
			System.out.println("                CyberBank Security");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_PURPLE + "=====================================================" + Cores.TEXT_RESET);
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta");
			System.out.println("            2 - Listar todas as Contas");
			System.out.println("            3 - Buscar Contas por Numero");
			System.out.println("            4 - Atualizar Dados da Conta");
			System.out.println("            5 - Apagar Conta");
			System.out.println("            6 - Sacar");
			System.out.println("            7 - Depositar");
			System.out.println("            8 - Transferir Valores");
			System.out.println("            9 - Sair");
			System.out.println("                                                     ");
			System.out.println(Cores.TEXT_PURPLE + "=====================================================" + Cores.TEXT_RESET);
			System.out.println("Entre com a opção desejada: ");
			System.out.println("                                                     ");

			op = sc.nextInt();

			if (op == 9) {
				System.out.println("\nCyberBank Security, Sua Segurança em Primeiro Lugar!");
				sc.close();
				System.exit(0);
			}

			switch (op) {
				case 1:
					System.out.println("\n\nCriar Conta\n\n");
					
					break;
					
				case 2:
					System.out.println("\n\nListar todas as Contas\n\n");
					
					break;
					
				case 3:
					System.out.println("\n\nBuscar Dados Da Conta.\n\n");
					System.out.println("Digite o Numero da Conta: ");

					break;
					
				case 4:
					System.out.println("\n\nAtualizar dados da Conta\n\n");
					System.out.println("Digite o Numero da Conta: ");
					break;
					
				case 5:
					System.out.println("\n\nApagar a Conta\n\n");
					System.out.println("Digite o Numero da Conta: ");
					break;
					
				case 6:
					System.out.println("\n\nSaque\n\n");
					System.out.println("Digite o Numero da Conta: ");
					break;
					
				case 7:
					System.out.println("\n\nDepósito\n\n");
					System.out.println("Digite o Numero da Conta: ");
					break;
					
				case 8:
					System.out.println("\n\nTransferência Entre Contas\n\n");
					System.out.println("Digite o Numero da Conta: ");
					break;
					
				default:
					System.out.println("\n\nOpção Inválida!");
					System.out.println("Por favor Selecione Uma Opção Válida!");
					break;
			}
		}
		
	}
	
}
