package gen_POO_heranca;

import gen_POO.Ingresso;

public class Vip extends Ingresso{

	private String beneficio;

	public Vip(String nome, double valor, String data, String hora, String duracao, String beneficio) {
		super(nome, valor, data, hora, duracao);
		this.beneficio = beneficio;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Beneficio Entrada VIP: " + beneficio);
		System.out.println("==========================================================");
	}
	
	
	
	
}
