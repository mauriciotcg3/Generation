package gen_ProjetoBanco.model;

public class ContaCorrente extends Conta{

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, float saldo, String titular, float limite) {
		super(numero, agencia, tipo, saldo, titular);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}

	@Override
	public boolean sacar(float valor) {
		
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("Saldo insuficiente Para Saque!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor); 
		System.out.println("Saque Realizado Com Sucesso!");
		return true;
	
	}

}
