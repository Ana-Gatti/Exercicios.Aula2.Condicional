//Faça um programa que receba três inteiros e diga qual deles é o maior.

package br.com.generation.aula02;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicioCondicional01 {

	public static void main(String[] args) {
		
		//informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);
		
		//declarando variáveis
		int numero1, numero2, numero3, maiorNumero = 0;
		
		//solicitando informações
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		//condicional
		if (numero1 > numero2 && numero1 > numero3) {
			maiorNumero = numero1;
			System.out.println("O maior número é: " + maiorNumero);
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			maiorNumero = numero2;
			System.out.println("O maior número é: " + maiorNumero);
		}
		
		else {
			System.out.println("O maior número é: " + maiorNumero);
		}
		
		//encerrando a função leia
		leia.close();
	}
}

