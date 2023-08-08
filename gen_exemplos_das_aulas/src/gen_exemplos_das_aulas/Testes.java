package gen_exemplos_das_aulas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		Scanner sc  = new Scanner(System.in);
		
		int n = 0;	
	
		lista.add(7); 
		lista.add(4);
		lista.add(2);
		lista.add(8);
		lista.add(0);
		
		System.out.println("Digite um numero");
		n = sc.nextInt();
		
		
		for (Integer numeros:lista) {
			if (lista.contains(n)) {
				lista.remove(n);
			}
			
			
		}
		
		System.out.println(lista);
		
	}
	
}
