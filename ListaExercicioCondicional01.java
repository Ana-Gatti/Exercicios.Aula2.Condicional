//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package br.com.generation.aula02;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicioCondicional01 {

	public static void main(String[] args) {
		
		//informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);
		
		//declarando vari�veis
		int numero1, numero2, numero3, maiorNumero = 0;
		
		//solicitando informa��es
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = leia.nextInt();
		
		//condicional
		if (numero1 > numero2 && numero1 > numero3) {
			maiorNumero = numero1;
			System.out.println("O maior n�mero �: " + maiorNumero);
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			maiorNumero = numero2;
			System.out.println("O maior n�mero �: " + maiorNumero);
		}
		
		else {
			System.out.println("O maior n�mero �: " + maiorNumero);
		}
		
		//encerrando a fun��o leia
		leia.close();
	}
}

