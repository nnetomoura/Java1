package ExerciciosLacosRep;

import java.util.Scanner;

public class PrimeiraQuestaoFor {

	public static void main(String[] args) {
		
		float numero = 0;
		int x, contImpar =0, contPar =0;
		
		Scanner leia = new Scanner (System.in);
		
		
		
		for (x=1;x<=10;x++) //fun��o para do portugol
		{
			
		System.out.println("\nInsira um n�mero: ");
		numero = leia.nextFloat();
			
			if (numero==0 || numero<0)
				{
					System.out.println("\nO n�mero zero (0) n�o � par nem impar, o programa ser� encerrado e a contagem vigente ser� mostrada abaixo.");
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
				System.out.println("\nContagem: foi inserido " + contPar + " n�mero par e " + contImpar + " n�meros �mpares!");
				
			}
			
			
			if (contImpar==1 && contPar!=1)
			{
				System.out.println("\nContagem: foram inserido " + contPar + " n�meros pares e " + contImpar + " n�mero �mpar!");
			}
			
			else if (contImpar!=1 && contPar!=1) 
			{
						
		System.out.println("\nContagem: foram inseridos " + contPar + " n�meros pares e " + contImpar + " n�meros �mpares!");
			
			}

	}

}

