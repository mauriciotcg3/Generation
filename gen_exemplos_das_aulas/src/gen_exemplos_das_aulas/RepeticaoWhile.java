package gen_exemplos_das_aulas;

import java.util.Scanner;

public class RepeticaoWhile {

	
	 public static void main(String[] args) {
	
		 int n1, somap = 0, impar=0;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite um numero: ");
		 n1 = sc.nextInt();
		 
		 while (n1 != 0) {

			 if (n1 % 2 == 0) {
				somap += n1;
			}else {
				impar++;
			}
			 
			 System.out.println("Digite um numero: ");
			 n1 = sc.nextInt();
		 }
		 
		 System.out.println("Parabens, você acertou o numero");
		 System.out.printf("A soma dos numeros pares eh: %d", somap);
		 System.out.println("Você digitou " + impar + " numeros impares!");
	}
	 
	 
}
