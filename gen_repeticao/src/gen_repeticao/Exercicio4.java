package gen_repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int idade, sexo, cate, back = 0, front = 0, mobile = 0, full = 0;
		String cont = "s";
		Scanner sc = new Scanner(System.in);
		
		while (cont.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a Idade: ");
			idade = sc.nextInt();
			System.out.println("Informe o Sexo\n 1- Masculino\n 2- Feminino\n 3- Outros\nDigite o Numero: ");
			sexo = sc.nextInt();
			System.out.println("Informe a Categoria\n 1- Backend\n 2- Frontend\n 3- Mobile\n 4-FullStack\nDigite o Numero: ");
			cate = sc.nextInt();
			
			switch (cate) {
			case 1:
				
				back++;
				break;
				
			case 2:
				
				if (sexo == 2) {
					front++;
					break;
				}
				
				break;
				
			case 3:
				
				if (idade < 40 && sexo == 1) {
					mobile++;
					break;
				}
				
				break;
				
			case 4:
				
				if (idade < 30 && sexo == 2) {
					full++;
					break;
				}
				
				break;
				
			}
			
			System.out.println("Deseja Continuar? (S/N)");
			cont = sc.next();
			
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + back);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + back);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + back);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + back);
		
	}
	
}
