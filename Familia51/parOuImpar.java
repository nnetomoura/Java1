package Familia51;

import java.util.Scanner;

/*
4 - Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */
public class parOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1, res;
		
		
		Scanner leia = new Scanner(System.in); //entrada de dados;
		
		System.out.println("Insira o número desejado: ");
		n1 = leia.nextDouble(); //ler os dados inseridos;
		
		if (n1 % 2 == 0)
		{
			res = Math.sqrt(n1);
			System.out.println("\nO número inserido é par e sua raiz quadrada é " + res + ".");
			System.out.printf("\nE se arredondarmos? R: % 2.2f", res); //(%2.2f", variável) é o argumento para arredondar!!!
		}
		else
		{
			res = Math.pow(n1, 2);
			System.out.println("\nO número inserido é IMPAR! Este mesmo número elevado ao quadrado é igual a: "+ res + ".");
			System.out.printf("\nE se o arredondarmos? R: %2.2f", res);
		}
		
	}

}
