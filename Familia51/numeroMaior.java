package Familia51;

import java.util.Scanner;

public class numeroMaior {

	//Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira o valor do primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nInsira o valor do segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nInsira o valor do terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nO mair número é: " + n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("\nO maior número é: " + n2);
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("\nO maior número é: " + n3);
		}
		
		else if (n1==n1 && n1==n2 && n1==n3 && n2==n2 && n2==n1 && n2==n3 && n3==n1 && n3==n2 && n3==n3)
		{
			System.out.println("\nEntrada inválida. Digite números diferentes!");
		}
	}

}
