package gen_POO;

import gen_POO_heranca.Perfumaria;
import gen_POO_heranca.Remedio;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Remedio[] remeList = new Remedio[2];
		Perfumaria[] perfuList = new Perfumaria[2];
		
		remeList[0] = new Remedio("Dorflex", "Analgésico", 35, "Não Receitado", "Não Trajado");
		remeList[1] = new Remedio("Rivotril ", "Benzodiazepinas ", 150, "Receitado", "Tarja Preta");
		perfuList[0] = new Perfumaria("Perfume Egeo", "Perfume", 120, "Oboticario");
		perfuList[1] = new Perfumaria("Perfume Egeo", "Perfume", 120, "Oboticario");
		
		for (Remedio remedio : remeList) {
			remedio.visualizar();
		}
		
		for (Perfumaria perfumaria : perfuList) {
			perfumaria.visualizar();
		}
		
	}
	
}
