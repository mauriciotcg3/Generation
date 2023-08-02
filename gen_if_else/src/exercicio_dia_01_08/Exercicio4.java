package exercicio_dia_01_08;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String tipo, especie, come;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ele é vertebrado ou invertebrado: ");
		tipo = sc.next();
		
		
		if (tipo.equals("vertebrado")) {
			
			System.out.print("Ele é uma ave ou um mamifero: ");
			especie = sc.next();
			
			if (especie.equals("ave")) {
				
				System.out.print("Ele é carnivoro ou onivoro: ");
				come = sc.next();
				
				if (come.equals("carnivoro")) {
					System.out.println("Seu animal é uma Aguia");
				}else {
					System.out.println("Seu animal é uma Pomba");
				}
				
			}else {
				
				System.out.print("Ele é herbivoro ou onivoro: ");
				come = sc.next();
				
				if (come.equals("herbivoro")) {
					System.out.println("Seu animal é uma Vaca");
				}else {
					System.out.println("Seu animal é um Humano");
				}
				
			}
			
		}else {
			
			System.out.print("Ele é um inseto ou um anelideo: ");
			especie = sc.next();
			
			if (especie.equals("inseto")) {
				
				System.out.print("Ele é hematofago ou herbivoro: ");
				come = sc.next();
				
				if (come.equals("Hematofago")) {
					System.out.println("Seu animal é uma Pulga");
				}else {
					System.out.println("Seu animal é uma Largata");
				}
				
			}else {
				
				System.out.print("Ele é hematofago ou onivoro: ");
				come = sc.next();
				
				if (come.equals("hematofago")) {
					System.out.println("Seu animal é uma sanguessuga");
				}else {
					System.out.println("Seu animal é um minhoca");
				}
				
			}
		}
		
	}
	
}
