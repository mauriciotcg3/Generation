package gen_colection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Queue<String> listaCliente = new LinkedList<String>();
		Scanner sc  = new Scanner(System.in);
		int op;
		String cliente;
		
		
		while (true) {
			
			System.out.println("=================================");
			System.out.println("1 - Adicionar Cliente");
			System.out.println("2 - Listar Todos Os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("=================================");
			System.out.println("Entre Com a Opção Desejada");
			op = sc.nextInt();
			
			if (op == 0) {
				System.out.println("Obrigado por Utilizar o Programa!");
				break;
			}
			
			switch (op) {
			case 1: 
				
				System.out.println("Digite o Nome do Cliente");
				cliente = sc.next();
				listaCliente.add(cliente);
				System.out.println("Cliente Adicionado Com Sucesso!\n\n");
				break;
				
			case 2:
				
				System.out.println("\n\n");
				Iterator<String> iterator = listaCliente.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("\n\n");
				break;
				
			case 3:
				
				
				if (listaCliente.isEmpty() == true) {
					System.out.println("A fila está vazia");
				}else {
					System.out.println("Cliente " + listaCliente.poll() + ", irá ser atendido!");
					System.out.println("Clientes restantes na fila: ");
					Iterator<String> remove = listaCliente.iterator();
					while (remove.hasNext()) {
						System.out.println(remove.next());
					}
				}
			
				break;
				
			default:
				System.out.println("Opção Invalida!");
				break;
			}
			
			
		}
			
			
			
		
		
	}
	
}
