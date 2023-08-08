package gen_exemplos_das_aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		
		int soma = 0;
		
		System.out.println("\nAdicionando um Elemento Da Lista");
		
		lista.add(7); //Adiciona um Elemento no ArrayList
		lista.add(4);
		lista.add(2);
		lista.add(8);
		lista.add(0);
		
		
		//Forma de Ver o conteudo do Arraylist
		for(Integer elementos:lista) {
			//soma += elementos;
			System.out.println(elementos);
		}
		
		
		
		System.out.println("----------------------------------");
		
		
		
		System.out.println("\nRemovendo um Elemento Da Lista");
		System.out.println();
		lista.remove(0); //Removendo um Elemento do ArrayList
		
		for(Integer elementos:lista) {
			System.out.println(elementos);
		}
		
		
		System.out.println("----------------------------------");
		
		//para pegar um elemento do arraylist
		int primeiroElemento = lista.get(0);
		System.out.println(primeiroElemento);
		
		
		// metodo size pega o tamanho da lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\nElementos: " + lista.get(i));
		}
		
		System.out.println("----------------------------------");
		
		
		Collections.sort(lista); // Arruma do maior pro maior
		System.out.println(lista);
		
		
		
		System.out.println("----------------------------------");
		
		//Criando o Set
		Set<Integer> listaSet = new HashSet<Integer>();
		
		listaSet.add(8);
		listaSet.add(4);
		listaSet.add(7);
		listaSet.add(1);
		listaSet.add(0);
		
		Iterator<Integer> listasetinterator = listaSet.iterator();
		
		while(listasetinterator.hasNext()) {
			System.out.println(listasetinterator.next()); // mostra os Elementos
		}
		
	}
	
}
