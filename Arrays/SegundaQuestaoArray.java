package Arrays;

import java.util.Scanner;

public class SegundaQuestaoArray {

	public static void main(String[] args) {
	
		int [] numeros = new int[6];
		int [] pares = new int [6];
		int [] impares = new int [6];

		int par = 0, somaPar = 0 , impar = 0, contImpar = 0, contPar;
		int x;
		Scanner leia = new Scanner (System.in);
		
		for (x=0;x<6;x++) 
		{
			System.out.println("\nInsira o " +  (x+1) + "º número: ");
			numeros [x] = leia.nextInt(); // 2 4 8 3 1 1 
						
			if (numeros[x] % 2 == 0)
			{
				pares[par] = numeros[x]; // 2 4 8 : 8
				somaPar += numeros[x];
				par++; 
			}
			
			else 
			{
				impares[impar] = numeros[x];
				contImpar += numeros[x];
				impar++;
			}
		} 
		System.out.println("Os números pares foram: ");
		for (x=0;x<par;x++) //o xis vai ser "resetado"; //2 4 8. Lembrando que o mesmo funciona apenas como CONTADOR (e designará as posições dentro do vetor[]);
		{
			System.out.print(pares[x] + " ");
		}
		System.out.println("\nA soma dos números pares inseridos foi: " + somaPar);
		
		System.out.println("Os números ímpares foram: ");
		for (x=0;x<impar;x++) 
		{
			System.out.print(impares[x] + " ");
		}
		System.out.println("\nA quantidade de números ímpares inseridos foi: " + impar);
					
	}
	
}
