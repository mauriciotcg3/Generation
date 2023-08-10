package gen_POO;

import java.text.NumberFormat;

public class Farmacia {

	private String nome;
	private String tipo;
	private int valor;
	
	public Farmacia(String nome, String tipo, int valor) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getRemedio() {
		return nome;
	}

	public void setRemedio(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String converter() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatarValor = nf.format(valor);
		return formatarValor;
	}
	
	public void visualizar() {
		System.out.println("============================");
		System.out.println("Produto: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Preço: " + this.converter());
	}
	
}
