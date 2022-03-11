/* Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra: 10 - 14 - Infantil/ 15 - 17 - Juvenil/ 18 - 25 Adulto*/

package br.com.generation.aula02;

//importando biblioteca
import java.util.Scanner;

public class ListaExercicioCondicional03 {
	
	public static void main(String[] args) {
		
		//informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner (System.in);
		
		//declarando vari�veis
		int idade;
		
		//solicitando informa��es
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		//condicional
		if (idade >= 10 && idade <= 14){
			System.out.println("Voc� foi inclu�do(a) na categoria infantil!");
		}
		
		else if (idade >= 15 && idade <= 17){
			System.out.println("Voc� foi inclu�do(a) na categoria juvenil!");	
		}
		
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Voc� foi inclu�do(a) na categoria adulto!");
		}
		
		else { System.out.println("Os dados informados n�o s�o v�lidos. Insira uma idade de 10 a 25 anos!");
		}
		
		//encerrando a fun��o leia
		leia.close();
		
	}

}
