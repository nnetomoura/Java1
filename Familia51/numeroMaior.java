package Familia51;

import java.util.Scanner;

public class numeroMaior {

	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira o valor do primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("\nInsira o valor do segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\nInsira o valor do terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("\nO mair n�mero �: " + n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("\nO maior n�mero �: " + n2);
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("\nO maior n�mero �: " + n3);
		}
		
		else if (n1==n1 && n1==n2 && n1==n3 && n2==n2 && n2==n1 && n2==n3 && n3==n1 && n3==n2 && n3==n3)
		{
			System.out.println("\nEntrada inv�lida. Digite n�meros diferentes!");
		}
	}

}
