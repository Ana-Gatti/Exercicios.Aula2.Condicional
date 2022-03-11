package br.com.generation.aula02;

import java.util.Scanner;

public class ExampleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
				
		System.out.println("Digite uma letra entre A e D: ");
		String letra = leia.next();
		
		switch (letra) {
			case "A":
				System.out.println("Amora");
			break;	
			
			case "B":
				System.out.println("Banana");
			break;
			
			case "C":
				System.out.println("Carambola");
			break;
		
			case "D":
				System.out.println("Damasco");
			break;
		}
	
		leia.close();
	}
	
	
	
}



