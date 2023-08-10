package gen_POO_heranca;

import gen_POO.Cliente;

public class PessoaJuridica extends Cliente{

	private String cnpj;

	public PessoaJuridica(String nome, String end, int idade, String tel, String num, String cnpj) {
		super(nome, end, idade, tel, num);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println("============================");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Numero: " + getNum());
		System.out.println("Endereco: " + getEnd());
		System.out.println("Telefone: " + getTel());
		System.out.println("CNPJ: " + cnpj);
		System.out.println("============================");
	}
	
	
}
