package ExerciciosLacosRep;

import java.util.Scanner;

public class TerceiraQuestaoWhile {

	public static void main(String[] args) {
/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. */
		
		int idade=0, cont21=0, cont50=0;
		
		Scanner leia = new Scanner (System.in);
				
		System.out.println("\nEnte com o valor da idade: ");
		idade = leia.nextInt();
		
		if (idade==-99) 
			{
			System.out.println("\n-99 detectado! O programa será encerrado.");
			}
			
				while (idade!=-99)		
				{
				System.out.println("\nEnte com o valor da idade: ");
				idade = leia.nextInt();
		
				if (idade<21)
				{
				cont21++;
				}
			
				if (idade>50)
				{
					cont50++;
				}
				
		}
		
			if (cont21==1 && cont50 !=1)
			{
				System.out.println("\nAo todo " + cont21 + " pessoa tem menos de 21 anos e " + cont50 + " pessoas tem mais de 50 anos.");
			}
			
			if (cont50==1 && cont21!=1)
			{
				System.out.println("\nAo todo " + cont50 + " pessoa tem mais de 50 anos e " + cont21 + " pessoas tem menos de 21 anos.");
			}
	
			else if (cont21!=1 && cont50!=1)
			{
				System.out.println("\nAo todo " + cont21 + " pessoas tem menos de 21 anos e " + cont50 + " pessoas tem mais de 50 anos.");
			}
			
	}
	
		
		
	

}
