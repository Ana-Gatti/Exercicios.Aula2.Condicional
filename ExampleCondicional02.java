package br.com.generation.aula02;

import java.util.Scanner;

public class ExampleCondicional02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2, resultado = 0.0;
		char operacao;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o operador: ");
		operacao = leia.next().charAt(0);
		
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		if (operacao == '+') {
			resultado = numero1 + numero2;	
		}
		
		else if (operacao == '-') {
			resultado = numero1 - numero2;
		}
		
		else if (operacao == '*') {
			resultado = numero1 * numero2;
		}
		
		else if (operacao == '/') {
			resultado = numero1 / numero2;
		}
		
		else {
			System.out.println("Dados inválidos. Os operadores devem ser: +, -, *, /");
		}
		
		
		System.out.println("O resultado é: " + resultado);

		leia.close();
		
		
		
		

	}

}
