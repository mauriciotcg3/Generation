package gen_exemplos_das_aulas;

import java.util.Iterator;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		
		pilha.push("Prato verde"); //inseri elementos na pilha
		pilha.push("Prato rosa");
		pilha.push("Prato azul");
		pilha.push("Prato branco");
		
		
		System.out.println("\n"+pilha);
		
		// Remove o elemento da pilha
		System.out.println("Removendo um elemento da pilha: " + pilha.pop());
		
		System.out.println("\n"+pilha);
		
		// Mostra o primeiro Elemento da pilha
		System.out.println("\nPrimeiro elemento da Pilha: " + pilha.peek());
		
		//Mostra o tamanho da pilha
		System.out.println("znTamanho da pilha: " + pilha.size());
		
		//Mostra um elemente para ver se ele consta
		System.out.println(pilha.contains("Prato azul"));
		
		Iterator<String> iterator = pilha.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		pilha.clear();
		
		System.out.println(pilha);
		
		System.out.println("\nA pilha está vazia? " + pilha.empty());
		
	}
	
	
}
