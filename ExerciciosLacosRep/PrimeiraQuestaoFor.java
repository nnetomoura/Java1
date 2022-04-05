package ExerciciosLacosRep;

import java.util.Scanner;

public class PrimeiraQuestaoFor {

	public static void main(String[] args) {
		
		float numero = 0;
		int x, contImpar =0, contPar =0;
		
		Scanner leia = new Scanner (System.in);
		
		
		
		for (x=1;x<=10;x++) //função para do portugol
		{
			
		System.out.println("\nInsira um número: ");
		numero = leia.nextFloat();
			
			if (numero==0 || numero<0)
				{
					System.out.println("\nO número zero (0) não é par nem impar, o programa será encerrado e a contagem vigente será mostrada abaixo.");
					break;
				}
			else 
			{
				
				if (numero % 2 == 0)
					{
					contPar++;
					}
			
				else 
					{
					contImpar++;
					}
			}
					
		}
		
			if (contPar==1 && contImpar!=1) 
			{
				System.out.println("\nContagem: foi inserido " + contPar + " número par e " + contImpar + " números ímpares!");
				
			}
			
			
			if (contImpar==1 && contPar!=1)
			{
				System.out.println("\nContagem: foram inserido " + contPar + " números pares e " + contImpar + " número ímpar!");
			}
			
			else if (contImpar!=1 && contPar!=1) 
			{
						
		System.out.println("\nContagem: foram inseridos " + contPar + " números pares e " + contImpar + " números ímpares!");
			
			}

	}

}

