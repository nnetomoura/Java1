package Familia51;

import java.util.Scanner;

/*
4 - Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */
public class parOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1, res;
		
		
		Scanner leia = new Scanner(System.in); //entrada de dados;
		
		System.out.println("Insira o n�mero desejado: ");
		n1 = leia.nextDouble(); //ler os dados inseridos;
		
		if (n1 % 2 == 0)
		{
			res = Math.sqrt(n1);
			System.out.println("\nO n�mero inserido � par e sua raiz quadrada � " + res + ".");
			System.out.printf("\nE se arredondarmos? R: % 2.2f", res); //(%2.2f", vari�vel) � o argumento para arredondar!!!
		}
		else
		{
			res = Math.pow(n1, 2);
			System.out.println("\nO n�mero inserido � IMPAR! Este mesmo n�mero elevado ao quadrado � igual a: "+ res + ".");
			System.out.printf("\nE se o arredondarmos? R: %2.2f", res);
		}
		
	}

}
