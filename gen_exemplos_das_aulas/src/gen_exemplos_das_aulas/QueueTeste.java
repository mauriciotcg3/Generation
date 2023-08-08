package gen_exemplos_das_aulas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTeste {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>(); 
	
		
		for (int i = 0; i < 10; i++) {
			fila.add(i);
		}
		
		//Mostra os Elementos da Lista
		System.out.println("\nElementos da Fila: " + fila);
		
		//remove os elementos da fila
		System.out.println("\nRemove os elementos da Fila: " + fila.remove());
		
		//Adiciona Elementos na Fila
		System.out.println("\nElementos da Fila: " + fila.add(11));
		
		//Pega o Elemento da fila, vulgo primeiro
		System.out.println("Pega um Elemento da fila: " + fila.peek());
		
		//Mostra o tamanho da fila
		System.out.println("Mostra o Tamanho da Fila: " + fila.size());
		
		//verifica se existe o elemento na fila
		System.out.println("Verifica se existe na fila: " + fila.contains(35));
		
		//Tira o primeiro elemento da fila
		System.out.println("Primeiro elemento que vai ser retirado: " + fila.poll());
		
		System.out.println("");
		
		Iterator<Integer> iterator = fila.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
