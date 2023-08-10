package gen_POO_heranca;

import gen_POO.Game;

public class Jogo extends Game{

	private String dlc;

	public Jogo(String nome, String cat, double valor, String dlc, String distribuidora) {
		super(nome, cat, valor, distribuidora);
		this.dlc = dlc;
	}

	public String getDlc() {
		return dlc;
	}

	public void setDlc(String dlc) {
		this.dlc = dlc;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Possui DLC: " + dlc);
		System.out.println("============================");
	}

	
	
}
