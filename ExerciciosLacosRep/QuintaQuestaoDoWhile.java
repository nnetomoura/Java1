package ExerciciosLacosRep;

import java.util.Scanner;

public class QuintaQuestaoDoWhile {

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 * 
 */
	public static void main(String[] args) {
	
		double numero, somaNumero=0;
		Scanner leia = new Scanner (System.in);
	
				
		do
		{
			System.out.println("Insira um n�mero: ");
			numero = leia.nextDouble();
			
			somaNumero += numero; // somaNumero = somaNumero + numero;
		
		}
		while (numero!=0);
		
		System.out.println("\nA soma dos n�meros inseridos � igual a: " + somaNumero);
		
		
		
		
		
		
		
	}

}
