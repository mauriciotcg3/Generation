package gen_POO;

import gen_POO_heranca.Gerente;
import gen_POO_heranca.Vendedor;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Gerente[] genList = new Gerente[2];
		Vendedor[] venList = new Vendedor[2];
		
		genList[0] = new Gerente("Thiago", "47812596300", "Gestor De Sistemas", 4300.00, 25, 56);
		genList[1] = new Gerente("Kelly", "00600578945", "Gestor De vendas", 2523.56, 23, 78);
		venList[0] = new Vendedor("Antonio", "05064231289", "Vendedor Varejo", 1568.66, 2, 200.00);
		venList[1] = new Vendedor("Kelly", "00600578945", "Vendedor Varejo", 1638.66, 12, 350.00);
		
		
		for (Gerente gerente : genList) {
			gerente.visualizar();
		}
		
		for (Vendedor vendedor : venList) {
			vendedor.visualizar();
		}
		
	}
	
}
