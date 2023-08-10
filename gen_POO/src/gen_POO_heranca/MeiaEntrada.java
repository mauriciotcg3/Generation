package gen_POO_heranca;

import gen_POO.Ingresso;

public class MeiaEntrada extends Ingresso{

	private String documento;

	public MeiaEntrada(String nome, double valor, String data, String hora, String duracao, String documento) {
		super(nome, valor, data, hora, duracao);
		this.documento = documento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Documento da Meia: " + documento);
		System.out.println("==========================================================");
	}
	
	
	
}
