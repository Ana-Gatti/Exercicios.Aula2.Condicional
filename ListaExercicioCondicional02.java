//Faça um programa que entre com três números e coloque em ordem crescente.

package br.com.generation.aula02;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicioCondicional02 {
	
	public static void main(String[] args) {
		
		//informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner (System.in);
		
		//declarando variáveis
		int numero1, numero2, numero3;
		
		//solicitando informações
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		//condicional
		
		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.println("A ordem crescente é: " + numero1 + "," + numero2 + "," + numero3);
		}
		
		else if (numero1 <= numero3 && numero3 <= numero2) {
			System.out.println("A ordem crescente é: " + numero1 + "," + numero3 + "," + numero2);
		}
		
		else if (numero2 <= numero1 && numero1 <= numero3) {
			System.out.println("A ordem crescente é: " + numero2 + "," + numero1 + "," + numero3);
		}
		
		else if (numero2 <= numero3 && numero3 <= numero1) {
			System.out.println("A ordem crescente é: " + numero2 + "," + numero3 + "," + numero1);
		}
		
		else if (numero3 <= numero1 && numero1 <= numero2) {
			System.out.println("A ordem crescente é: " + numero3 + "," + numero1 + "," + numero2);
			
		}
		
		else {
			System.out.println("A ordem crescente é: " + numero3 + "," + numero2 + "," + numero1);
		}
		
		
		//encerrando a função leia
		leia.close();
	}

}
