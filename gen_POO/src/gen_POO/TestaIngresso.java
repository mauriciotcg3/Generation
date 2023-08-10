package gen_POO;

import gen_POO_heranca.MeiaEntrada;
import gen_POO_heranca.Vip;

public class TestaIngresso {

	public static void main(String[] args) {
		
		MeiaEntrada[] meiaList = new MeiaEntrada[2];
		Vip[] vipList = new Vip[2];
		
		meiaList[0] = new MeiaEntrada("Machine Gun Kelly Tour - Tickets For My Downfall", 400.00, "04/10/2023", "21:00", "2:30 Horas", "Carteirinha da Faculdade");
		meiaList[1] = new MeiaEntrada("Simples Plan - Get Your Heart On Tour", 250.00, "24/11/2023", "20:00", "2:00 Horas", "Carteirinha da Faculdade");
		vipList[0] = new Vip("Machine Gun Kelly Tour - Tickets For My Downfall", 1000.00, "04/10/2023", "21:00", "2:30 Horas", "Camarote");
		vipList[1] = new Vip("Simples Plan - Get Your Heart On Tour", 700.00, "24/11/2023", "20:00", "2:00 Horas", "Fileira da Frente");
		
		for (MeiaEntrada meiaentrada : meiaList) {
			meiaentrada.visualizar();
		}
	
		for (Vip vip : vipList) {
			vip.visualizar();
		}
		
	}
	
}
