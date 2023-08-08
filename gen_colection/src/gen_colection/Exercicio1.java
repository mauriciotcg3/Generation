package gen_colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			String cor = sc.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nLista de Cores");
		for (String elemento:cores) {
			System.out.println(elemento);
		}
		
		System.out.println("\nLista das Cores Ordenadas");
		Collections.sort(cores);
		for (String elemento:cores) {
			System.out.println(elemento);
		}
		
	}
	
}
