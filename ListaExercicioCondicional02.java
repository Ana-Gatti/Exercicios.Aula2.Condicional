//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

package br.com.generation.aula02;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicioCondicional02 {
	
	public static void main(String[] args) {
		
		//informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner (System.in);
		
		//declarando vari�veis
		int numero1, numero2, numero3;
		
		//solicitando informa��es
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = leia.nextInt();
		
		//condicional
		
		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.println("A ordem crescente �: " + numero1 + "," + numero2 + "," + numero3);
		}
		
		else if (numero1 <= numero3 && numero3 <= numero2) {
			System.out.println("A ordem crescente �: " + numero1 + "," + numero3 + "," + numero2);
		}
		
		else if (numero2 <= numero1 && numero1 <= numero3) {
			System.out.println("A ordem crescente �: " + numero2 + "," + numero1 + "," + numero3);
		}
		
		else if (numero2 <= numero3 && numero3 <= numero1) {
			System.out.println("A ordem crescente �: " + numero2 + "," + numero3 + "," + numero1);
		}
		
		else if (numero3 <= numero1 && numero1 <= numero2) {
			System.out.println("A ordem crescente �: " + numero3 + "," + numero1 + "," + numero2);
			
		}
		
		else {
			System.out.println("A ordem crescente �: " + numero3 + "," + numero2 + "," + numero1);
		}
		
		
		//encerrando a fun��o leia
		leia.close();
	}

}
