package gen_POO;

public class Cliente {

	private String nome;
	private String end;
	private int idade;
	private String tel;
	private String num;
	
	
	public Cliente(String nome, String end, int idade, String tel, String num) {
		super();
		this.nome = nome;
		this.end = end;
		this.idade = idade;
		this.tel = tel;
		this.num = num;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}
	
	
	public void visualizar() {
		System.out.println("============================");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Numero: " + num);
		System.out.println("Endereco: " + end);
		System.out.println("Telefone: " + tel);
		System.out.println("============================");
	}
	
}
