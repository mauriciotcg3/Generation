package gen_POO_heranca;

import gen_POO.Cliente;

public class PessoaFisica extends Cliente{

	private String cpf;

	public PessoaFisica(String nome, String end, int idade, String tel, String num, String cpf) {
		super(nome, end, idade, tel, num);
		this.cpf = cpf;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("============================");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Numero: " + getNum());
		System.out.println("Endereco: " + getEnd());
		System.out.println("Telefone: " + getTel());
		System.out.println("CPF: " + cpf);
		System.out.println("============================");
	}
	
}
