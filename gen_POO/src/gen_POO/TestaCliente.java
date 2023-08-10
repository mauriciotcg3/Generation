package gen_POO;

import gen_POO_heranca.PessoaFisica;
import gen_POO_heranca.PessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {
		
		PessoaFisica [] pf1 = new PessoaFisica[2];
		PessoaJuridica [] pj = new PessoaJuridica[2];
		
		pf1[0] = new PessoaFisica("Lucas", "Avenida Dois", 23, "11948152603", "203", "12545865893");
		pf1[1] = new PessoaFisica("Gabriellaa", "Avenida Tres", 24, "11946791356", "123", "12345678900");
		pj[0] = new PessoaJuridica("Kelly", "Rua Cinco", 45, "11946102358", "02", "36156147000123");
		pj[1] = new PessoaJuridica("Julia", "Avenida Principal", 34, "11978451203", "15", "32654987000123");
		
		
		for (PessoaFisica pessoaFisica : pf1) {
			pessoaFisica.visualizar();
		}
		
		for (PessoaJuridica pessoaJuridica : pj) {
			pessoaJuridica.visualizar();
		}
		
	}
	
	
}
