package gen_POO;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private String cpf;
	private String setor;
	private double salario;
	private int tempo;
	
	public Funcionario(String nome, String cpf, String setor, double salario, int tempo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
		this.salario = salario;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public void visualizar() {
		System.out.println("============================");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Setor: " + setor);
		System.out.println("Salario: " + this.converter());
		System.out.println("Meses de trabalho: " + tempo);
	}
	
	public String converter() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
}
