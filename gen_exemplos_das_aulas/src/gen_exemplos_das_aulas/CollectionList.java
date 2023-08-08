package gen_exemplos_das_aulas;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionList {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<>();
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(8.0);
		notas.add(9.0);
		
		System.out.println("Notas Cadastradas: " + notas.toString());
		
		System.out.println(notas.contains(6d));
		
		//alterar valor
		notas.set(1, 6.0d);
		System.out.println("Notas Cadastradas: " + notas.toString());
		
		//remover valor
		notas.remove(1);
		System.out.println("Notas Cadastradas: " + notas.toString());
		
		//mostra maior valor
		System.out.println(Collections.max(notas));
		
		//mostra menor valor
		System.out.println(Collections.min(notas));
		
	}
	
}
