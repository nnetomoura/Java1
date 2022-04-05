package ExerciciosLacosRep;

import java.util.Scanner;

public class QuintaQuestaoDoWhile {

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 * 
 */
	public static void main(String[] args) {
	
		double numero, somaNumero=0;
		Scanner leia = new Scanner (System.in);
	
				
		do
		{
			System.out.println("Insira um número: ");
			numero = leia.nextDouble();
			
			somaNumero += numero; // somaNumero = somaNumero + numero;
		
		}
		while (numero!=0);
		
		System.out.println("\nA soma dos números inseridos é igual a: " + somaNumero);
		
		
		
		
		
		
		
	}

}
