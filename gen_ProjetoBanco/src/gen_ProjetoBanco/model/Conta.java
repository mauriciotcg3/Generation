package gen_ProjetoBanco.model;

import gen_ProjetoBanco.repository.ContaRepository;

public abstract class Conta implements ContaRepository{

	private int numero, agencia, tipo;
	private float saldo;
	private String titular;
	
	public Conta(int numero, int agencia, int tipo, float saldo, String titular) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.saldo = saldo;
		this.titular = titular;
	}

	
	public int getNumero() {
		return numero;
	}
	

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

	public int getAgencia() {
		return agencia;
	}
	

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	

	public int getTipo() {
		return tipo;
	}
	

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	

	public float getSaldo() {
		return saldo;
	}
	

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	

	public String getTitular() {
		return titular;
	}
	

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public boolean sacar(float valor) {
		
		if (valor > saldo) {
			System.out.println("Saldo insuficiente Para Saque!");
			return false;
		}else {
			this.setSaldo(this.getSaldo() - valor); 
			System.out.println("Saque Realizado Com Sucesso!");
			return true;
		}
		
	}

	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor); 
		System.out.println("Deposito Realizado Com Sucesso!");
	}
	
	public void visualizar() {
		String tipoConta = ".";
		
		switch (this.tipo) {
		
		case 1: 
			tipoConta = "Conta Corrente";
			break;
			
		case 2:
			tipoConta = "Conta Poupança";
			break;
		}
		
		System.out.println("\n\n=========================================================");
		System.out.println("Dados Da Conta");
		System.out.println("==========================================================");
		System.out.println("Titular: " + this.titular);
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Saldo: " + this.saldo);
		
	}
}
