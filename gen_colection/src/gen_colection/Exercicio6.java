package gen_colection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		
		Scanner sc  = new Scanner(System.in);
		int op;
		String livro;
		
while (true) {
			
			System.out.println("=================================");
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar Todos Os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
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
				
				System.out.println("");
				System.out.println("Digite o Nome do Livro");
				livro = sc.next();
				livros.push(livro);
				System.out.println("Livro Adicionado Com Sucesso!\n\n");
				System.out.println("");
				break;
				
			case 2:
				
				System.out.println("\n");
				Iterator<String> iterator = livros.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("\n");
				break;
				
			case 3:
				
				System.out.println("");
				if (livros.isEmpty() == true) {
					System.out.println("\nA Pilha está vazia\n");
				}else {
					System.out.println("O Livro " + livros.pop() + ", Foi Tirado da Pilha!");
					System.out.println("Livros que Ainda Estão na Pilha: ");
					Iterator<String> remove = livros.iterator();
					while (remove.hasNext()) {
						System.out.println(remove.next());
					}
				}
				System.out.println("");
				break;
				
			default:
				System.out.println("");
				System.out.println("Opção Invalida!");
				System.out.println("");
			}
			
			
		}
		

	}
	
	
	
}
