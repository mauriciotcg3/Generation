package gen_POO;

public class Ingresso {

	private String nome;
	private double valor;
	private String data;
	private String hora;
	private String duracao;
	
	
	public Ingresso(String nome, double valor, String data, String hora, String duracao) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.data = data;
		this.hora = hora;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getDuracao() {
		return duracao;
	}


	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public void visualizar() {
		System.out.println("==========================================================");
		System.out.println("Evento: " + nome);
		System.out.println("Preço: " + valor);
		System.out.println("Data: " + data);
		System.out.println("Horario: " + hora);
		System.out.println("Duração: " + duracao);
	}
	
}
