/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado. */

package br.com.generation.aula02;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicioCondiconal04 {
	
	public static void main(String[] args) {
		
		//informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner (System.in);
		
		//declarando vari�veis
		double numero, raiz = 0, quadrado = 0;
		
		//solicitando informa��es
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
		//condicional
		if (numero % 2 == 0) {
			 raiz = Math.sqrt(numero);
			 System.out.println("O n�mero " + numero+ " � par e sua raiz quadrada"
			 		+ " �: " +raiz);
		}
		
		
		else {quadrado = (numero * numero);
			System.out.println("O n�mero " + numero+ " � �mpar e seu n�mero elevado"
	 		+ " ao quadrado �: " +quadrado);
		}
		
		
		
		//encerrando a fun��o leia
		leia.close();
	}

}
