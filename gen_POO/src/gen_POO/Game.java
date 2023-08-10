package gen_POO;

import java.text.NumberFormat;

public class Game {

	private String nome;
	private String cat;
	private double valor;
	private String distribuidora;
	
	
	public Game(String nome, String cat, double valor, String distribuidora) {
		super();
		this.nome = nome;
		this.cat = cat;
		this.valor = valor;
		this.distribuidora = distribuidora;
	}


	public String getDistribuidora() {
		return distribuidora;
	}


	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCat() {
		return cat;
	}


	public void setCat(String cat) {
		this.cat = cat;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	
	public String converter() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda  = nf.format(valor);
		return formatoMoeda;
	}
	
	public void visualizar() {
		System.out.println("============================");
		System.out.println("Produto: " + nome);
		System.out.println("Categoria: " + cat);
		System.out.println("Preço: " + this.converter());
		System.out.println("Distribuidora: " + distribuidora);
	}
	
}
