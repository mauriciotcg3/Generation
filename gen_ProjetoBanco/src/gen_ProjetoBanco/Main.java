package gen_ProjetoBanco;

import java.util.Scanner;
import gen_ProjetoBanco.util.Cores;
import gen_ProjetoBanco.controller.ContaController;
import gen_ProjetoBanco.model.*;

public class Main {

	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		
		Scanner sc = new Scanner(System.in);
		int op, agencia, tipo, aniversario, numero, numeroDestino;
		float saldo, limite, valor;
		String titular;
		
		
		//Criar Contas
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, 1000f, "Jaime Silva", 100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, 2000f, "Maria Augusta", 100.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, 4000f, "Mariana Dos Santos", 12);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 126, 2, 8000f, "Juliana Ramos", 15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();
		
		while (true) {

			System.out.println("                                                     ");
			System.out.println(Cores.ANSI_PURPLE_BACKGROUND + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET + Cores.ANSI_PURPLE_BACKGROUND + "=====================================================" + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_PURPLE_BACKGROUND + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET + Cores.ANSI_PURPLE_BACKGROUND + "                                                     " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_PURPLE_BACKGROUND + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET + Cores.ANSI_PURPLE_BACKGROUND + "                CyberBank Security                   " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_PURPLE_BACKGROUND + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET + Cores.ANSI_PURPLE_BACKGROUND + "                                                     " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_PURPLE_BACKGROUND + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET + Cores.ANSI_PURPLE_BACKGROUND + "=====================================================" + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + "|                                                     " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            1 - Criar Conta                          " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            2 - Listar todas as Contas               " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            3 - Buscar Contas por Numero             " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            4 - Atualizar Dados da Conta             " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            5 - Apagar Conta	                      " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            6 - Sacar				      " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            7 - Depositar		              " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            8 - Transferir Valores	  	     " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            9 - Sair                                 " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|                                                     " + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_PURPLE_BACKGROUND + "|=====================================================" + Cores.TEXT_BLACK_BOLD + "|" + Cores.TEXT_RESET);
			System.out.print(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLACK + "|            Entre Com a Opção Desejada:              " + Cores.TEXT_BLACK_BOLD + "→" + Cores.TEXT_RESET + " ");
			op = sc.nextInt();
			
			


			if (op == 9) {
				System.out.println("\nCyberBank Security, Sua Segurança em Primeiro Lugar!");
				sc.close();
				System.exit(0);
			}

			switch (op) {
				case 1:
					System.out.println("Criar Conta\n\n");
					
					System.out.println("Digite o Numero da Agencia: ");
					agencia = sc.nextInt();
					System.out.println("Digite o Nome do Titular: ");
					sc.skip("\\R?");
					titular = sc.nextLine();
					
					do {
						System.out.println("1- Conta Corrente");
						System.out.println("2- Conta Poupança");
						System.out.println("Digite o Tipo de Conta");
						tipo = sc.nextInt();
					}while(tipo < 1 && tipo > 2);
					
					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = sc.nextFloat();
					
					switch (tipo) {
						case 1  -> {
							System.out.println("Digite o Limite de Crédito: (R$): ");
							limite = sc.nextFloat();
							contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, saldo, titular, limite));
						}
						case 2 -> {
							System.out.println("Digite o Aniversario da Conta: ");
							aniversario = sc.nextInt();
							contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, saldo, titular, aniversario));
						}
					}
					
					
					break;
				case 2:
					System.out.println("\n\nListar todas as Contas\n\n");
					contas.listarTodas();
					break;
					
				case 3:
					System.out.println("\n\nBuscar Dados Da Conta.\n\n");
					System.out.println("Digite o Numero da Conta: ");
					numero = sc.nextInt();
					
					contas.procurarPorNumero(numero);

					break;
					
				case 4:
					System.out.println("\n\nAtualizar dados da Conta\n\n");
					System.out.println("Digite o Numero da Conta: ");
					numero = sc.nextInt();
					
					if (contas.buscarNaCollection(numero) != null) {
						System.out.println("Digite o Numero Da Agência: ");
						agencia = sc.nextInt();
						System.out.println("Digite o Nome do Titular: ");
						sc.skip("\\R?");
						titular = sc.next();
						
						System.out.println("Digite o Saldo da Conta (R$): ");
						saldo = sc.nextFloat();
						
						tipo = contas.retornaTipo(numero);
						
						switch (tipo) {
						case 1 -> {
							System.out.println("Digite o Limite de Credito: ");
							limite = sc.nextFloat();
							contas.atualizar(new ContaCorrente(numero, agencia, tipo, saldo, titular, limite));
						}
						case 2 -> {
							System.out.println("Digite o Dia de Aniversario da Conta: ");
							aniversario = sc.nextInt();
							contas.atualizar(new ContaPoupanca(numero, agencia, tipo, saldo, titular, aniversario));
						}
						default ->{
							System.out.println("Tipo da Conta inválido!");
						}	
						}
						
					} else {
						System.out.println("\nConta Não Encontrada!");
					}
					
					break;
					
				case 5:
					System.out.println("\n\nApagar a Conta\n\n");
					System.out.println("Digite o Numero da Conta: ");
					numero = sc.nextInt();
					
					contas.deletar(numero);
					break;
					
				case 6:
					System.out.println("\n\nSaque\n\n");
					System.out.println("Digite o Numero da Conta: ");
					numero = sc.nextInt();
					
					do {
						System.out.println("Digite o Valor Do Saque: ");
						valor = sc.nextFloat();
					} while (valor <= 0);
					
					contas.sacar(numero, valor);
					
					break;
					
				case 7:
					System.out.println("\n\nDepósito\n\n");
					System.out.println("Digite o Numero da Conta: ");
					numero = sc.nextInt();
					
					do {
						System.out.println("Digite o Numero da Conta: ");
						valor = sc.nextFloat();
					} while (valor <= 0);
					
					contas.depositar(numero, valor);
					
					break;
					
				case 8:
					System.out.println("\n\nTransferência Entre Contas\n\n");
					System.out.println("Digite o Numero da Conta de Origem: ");
					numero = sc.nextInt();
					System.out.println("Digite o Numero da Conta de Destino: ");
					numeroDestino = sc.nextInt();
					
					do {
						System.out.println("Digite o Valor da Transferencia: ");
						valor = sc.nextFloat();
					} while (valor <= 0);
					
					break;
					
				default:
					System.out.println("\n\nOpção Inválida!");
					System.out.println("Por favor Selecione Uma Opção Válida!");
					break;
			}
		}
		
	}
	
}
