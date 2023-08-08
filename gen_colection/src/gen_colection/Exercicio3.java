package gen_colection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite um numero: ");
			int n = sc.nextInt();
			numeros.add(n);	
		}
		
		Iterator<Integer> numerosLista = numeros.iterator();
		
		System.out.println("Lista Dados do Set: ");
		
		while(numerosLista.hasNext()) {
			System.out.println(numerosLista.next()); // mostra os Elementos
		}
	}
	
	
}
