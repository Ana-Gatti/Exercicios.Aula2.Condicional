/* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra: 10 - 14 - Infantil/ 15 - 17 - Juvenil/ 18 - 25 Adulto*/

package br.com.generation.aula02;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicioCondicional03 {
	
	public static void main(String[] args) {
		
		//informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner (System.in);
		
		//declarando variáveis
		int idade;
		
		//solicitando informações
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		//condicional
		if (idade >= 10 && idade <= 14){
			System.out.println("Você foi incluído(a) na categoria infantil!");
		}
		
		else if (idade >= 15 && idade <= 17){
			System.out.println("Você foi incluído(a) na categoria juvenil!");	
		}
		
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Você foi incluído(a) na categoria adulto!");
		}
		
		else { System.out.println("Os dados informados não são válidos. Insira uma idade de 10 a 25 anos!");
		}
		
		//encerrando a função leia
		leia.close();
		
	}

}
