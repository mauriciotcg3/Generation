package gen_entrada_e_saida;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salbru, noturno, extra, desc, salliq;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor do Salario Bruto do(a) Colaborador(a): ");
		salbru = sc.nextFloat();
		System.out.println("Digite o Valor do Adicional Noturno do(a) Colaborador(a): ");
		noturno = sc.nextFloat();
		System.out.println("Digite o Valor das Horas Extras do(a) Colaborador(a): ");
		extra = sc.nextFloat();
		System.out.println("Digite o Valor do Desconto do(a) Colaborador(a): ");
		desc = sc.nextFloat();
		
		salliq = salbru + noturno + (extra*5) - desc;
		
		System.out.println("o Salario Liquido é de: " + salliq);
		
	}
	
}
