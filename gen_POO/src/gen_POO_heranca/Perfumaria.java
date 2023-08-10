package gen_POO_heranca;

import gen_POO.Farmacia;

public class Perfumaria extends Farmacia{

	private String marca;

	public Perfumaria(String remedio, String tipo, int valor, String marca) {
		super(remedio, tipo, valor);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Marca: " + marca);
		System.out.println("============================");
	}
	
	
	
}
