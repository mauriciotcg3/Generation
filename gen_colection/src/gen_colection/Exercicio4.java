package gen_colection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		Iterator<Integer> numerosLista = numeros.iterator();
		
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			
			if (numerosLista.hasNext()) {
				System.out.println("O numero " + n + " está localizado na posição: " + (i+1));
				break;
			}else if(numeros.contains(n)){
				
			}else {
				System.out.println("O número 40 não foi encontrado!");
				break;
			}
			
		}
	}
	
}
