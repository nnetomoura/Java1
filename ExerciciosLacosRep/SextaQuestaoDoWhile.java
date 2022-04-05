package ExerciciosLacosRep;

import java.util.Scanner;

public class SextaQuestaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int numero, somaMult3=0,contMult3=0;
	float media;
	Scanner leia = new Scanner (System.in);
	
	do
	{
		System.out.println("\nEntre com um número inteiro: ");
		numero = leia.nextInt();
		
		if(numero==0)
		{
			System.out.println("\nVocê digitou o número 0 (zero), o programa será encerrado!");
		}
		
		else
		{

			if (numero%3==0) 
			{
				somaMult3 +=numero;	//somaMult3 = somaMult3 + numero;
				contMult3++;
			}
		}
	
	} 
	while (numero!=0);
	
	media = somaMult3 / contMult3;
	
	System.out.println("\nA média dos números múltiplos de três foi de: " + media);
	}
	

}
