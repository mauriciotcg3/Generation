package gen_POO_heranca;

import gen_POO.Game;

public class Console extends Game{

	private String portatil;

	public Console(String nome, String cat, double valor, String distribuidora, String portatil) {
		super(nome, cat, valor, distribuidora);
		this.portatil = portatil;
	}

	public String getPortatil() {
		return portatil;
	}

	public void setPortatil(String portatil) {
		this.portatil = portatil;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Portatil: " + portatil);
		System.out.println("============================");
	}
	
}
