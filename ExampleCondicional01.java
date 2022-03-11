package br.com.generation.aula02;

import java.util.Scanner;

public class ExampleCondicional01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();

		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media >= 7.0 && media <= 10) {
			System.out.println("Aluno aprovado!!!\n"
					+ "A sua média foi de: " + media);
		}
		
		else if (media >= 3.0 && media < 7.0) {
			System.out.println("Aluno em recuperação!\n"
					+ "A sua média foi de: " + media);
			
		}
		else {
			System.out.println("Aluno reprovado!\n"
					+ "A sua média foi de: " + media);
		}
			
		leia.close();

		}

	}

