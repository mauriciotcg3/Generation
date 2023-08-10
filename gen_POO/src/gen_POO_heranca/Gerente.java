package gen_POO_heranca;

import gen_POO.Funcionario;

public class Gerente extends Funcionario{

	private int codigoGerente;

	public Gerente(String nome, String cpf, String setor, double salario, int tempo, int codigoGerente) {
		super(nome, cpf, setor, salario, tempo);
		this.codigoGerente = codigoGerente;
	}

	public int getCodigoGerente() {
		return codigoGerente;
	}

	public void setCodigoGerente(int codigoGerente) {
		this.codigoGerente = codigoGerente;
	}


	public void visualizar() {
		super.visualizar();
		System.out.println("Codigo do Gerente: " + codigoGerente);
		System.out.println("============================");
	}
	
	
	
}
