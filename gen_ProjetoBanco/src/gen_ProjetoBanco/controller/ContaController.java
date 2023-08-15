package gen_ProjetoBanco.controller;

import java.util.ArrayList;
import java.util.Iterator;

import gen_ProjetoBanco.model.Conta;
import gen_ProjetoBanco.repository.ContaRepository;

public class ContaController implements ContaRepository{

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			conta.visualizar();
		}else {
			System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
		}
	}

	@Override
	public void listarTodas() {
		for (Conta conta : listaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta Número: " + conta.getNumero() + " Foi criada com Sucesso");
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarConta = buscarNaCollection(conta.getNumero());
		
		if (buscarConta != null) {
			listaContas.set(listaContas.indexOf(buscarConta), conta);
			System.out.println("\nA Conta Numero: " + conta.getNumero() + " Foi Atualizada com Sucesso");
		}else {
			System.out.println("\nA Conta Numero: " + conta.getNumero() + " Não Foi Encontrada!");
		}
		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (listaContas.remove(conta) == true) {
				System.out.println("\nA conta Numero: " + numero + " Foi Deletada com Sucesso!");
			}
		}else {
			System.out.println("\\nA conta Numero: \" + numero + \" Não Foi Encontrada!");
		}
		
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (conta.sacar(valor) == true) {
				System.out.println("\nO Saque na Conta Numero: " + numero + " foi Efetuada com Sucesso!");
			}
				
		}else {
			System.out.println("\nA Conta Numero: "  + numero + " Não Foi Encontrada");
		}
		
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			conta.depositar(valor);
			System.out.println("\nO Deposito na Conta Numero: " + numero + " foi efetuado com sucesso!");
		}else {
			System.out.println("\nA Conta Numero: " + numero  + " Não Foi Encontrada ou a Conta Destino "
					+ "Não é uma Conta Corrente");
		}
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA transferencia fo iefetuada com sucesso");
			}
			
		}else {
			System.out.println("\nA Conta de Origem e/ou Destino Não Foram Encontradas");
		}
	}
	
	public int gerarNumero() {
		return ++ numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		
		return null;
	}

	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}
		
		return 0;
	}
	
}
