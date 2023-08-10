package gen_POO_heranca;

import java.text.NumberFormat;

import gen_POO.Funcionario;

public class Vendedor extends Funcionario{

	private double comissao;

	public Vendedor(String nome, String cpf, String setor, double salario, int tempo, double comissao) {
		super(nome, cpf, setor, salario, tempo);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}


	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão Das Vendas Mensais: " + this.converterComissao());
		System.out.println("============================");
	}


	public String converterComissao() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(comissao);
		return formatoMoeda;
	}
	
	
}
