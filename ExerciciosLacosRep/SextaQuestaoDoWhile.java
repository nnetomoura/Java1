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
		System.out.println("\nEntre com um n�mero inteiro: ");
		numero = leia.nextInt();
		
		if(numero==0)
		{
			System.out.println("\nVoc� digitou o n�mero 0 (zero), o programa ser� encerrado!");
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
	
	System.out.println("\nA m�dia dos n�meros m�ltiplos de tr�s foi de: " + media);
	}
	

}
