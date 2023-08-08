package gen_exemplos_das_aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		
		int op;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList<>();
		
		do {
			System.out.println("\n\tMenu De Opções");
			System.out.println("---------------------------------------------");
			System.out.println("1- Adicionar Produtos Ao Estoque");
			System.out.println("2- Remover Produtos do Estoque");
			System.out.println("3- Atualizar Produtos do Estoque");
			System.out.println("4- Mostrar Todos Os Produtos do Estoque");
			System.out.println("5- Deseja Encerar o Programa");
			System.out.println("---------------------------------------------");
			System.out.print("Digite a Opção Desejada: ");
			op = sc.nextInt();
			
			switch (op) {
				
			case 1: 
				
				sc.nextLine();
				System.out.println("\nDigite o Produto que Deseja Adicionar: ");
				String produto = sc.nextLine();
				estoque.add(produto);
				break;
				
			
				
			case 2:
				
				sc.nextLine();
				System.out.println("\nDigite o Produto que Deseja Remover: ");
				String produtoRemover = sc.nextLine();
				
				if (estoque.contains(produtoRemover)) {
					estoque.remove(produtoRemover);
					System.out.println("Produto Removido Com Sucesso!");
				}else {
					System.out.println("Esse Produto Não Existente No Estoque!");
				}
				
				break;
			
			
			case 3:
				
				sc.nextLine();
				System.out.println("\nDigite o Produto que Deseja Atualizar: ");
				String produtoVerifica = sc.nextLine();
				System.out.println("Digite o Produto que Ficara no Lugar do "+produtoVerifica);
				String produtoNovo = sc.nextLine();
				
				if (estoque.contains(produtoVerifica)) {
					estoque.remove(produtoVerifica);
					estoque.add(produtoNovo);
					System.out.println("Produto Adicionaddo Com Sucesso!");
				}else {
					System.out.println("Esse Produto Não Existente No Estoque!");
				}
				
				break;
				
			case 4:
				
				System.out.println("\nOs Produtos que Temos No Estoque São: ");
				System.out.println(estoque);
				break;
				
			case 5:
		
				System.out.println("\nMuito Obrigado Por Usar o Programa!");
				System.out.println("Volte Sempre!");
				break;
				
			default:
				System.out.println("\nOpção Invalida!");
				System.out.println("Por Favor Digite Novamente");
				break;
			}
				
		} while (op != 5);
		
	}
	
}
