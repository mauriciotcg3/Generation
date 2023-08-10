package gen_POO_heranca;

import gen_POO.Farmacia;

public class Remedio extends Farmacia{

	private String receita;
	private String tarja;
	
	public Remedio(String remedio, String tipo, int valor, String receita, String tarja) {
		super(remedio, tipo, valor);
		this.receita = receita;
		this.tarja = tarja;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Receitado: " + receita);
		System.out.println("Tarja: " + tarja);
		System.out.println("============================");
	}
	
	
	
}
