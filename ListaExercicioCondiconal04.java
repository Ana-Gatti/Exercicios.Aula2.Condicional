/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */

package br.com.generation.aula02;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicioCondiconal04 {
	
	public static void main(String[] args) {
		
		//informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner (System.in);
		
		//declarando variáveis
		double numero, raiz = 0, quadrado = 0;
		
		//solicitando informações
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		//condicional
		if (numero % 2 == 0) {
			 raiz = Math.sqrt(numero);
			 System.out.println("O número " + numero+ " é par e sua raiz quadrada"
			 		+ " é: " +raiz);
		}
		
		
		else {quadrado = (numero * numero);
			System.out.println("O número " + numero+ " é ímpar e seu número elevado"
	 		+ " ao quadrado é: " +quadrado);
		}
		
		
		
		//encerrando a função leia
		leia.close();
	}

}
