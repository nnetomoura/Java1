package Familia512;

import java.util.Scanner;

public class PrimeiraListaUmJava {

	//1- Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int anos = 0, meses = 0, dias = 0, res = 0; //entrada de dados;
		
		float totalDias=0; //sa�da de dados.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos anos voc� tem?" );
		anos = leia.nextInt();
					
		if (anos<=0)
		{
			System.out.println("Entrada inv�lida! Insira qualquer n�mero a partir de 1 (um) e diferente de zero!");
		}
		
		else 
		{
					
			System.out.println("Digite o n�mero do m�s atual (ex: Junho = 6): ");
			meses = leia.nextInt();
			
			System.out.println("\nAgora insira o dia do m�s (ex: 12) ");
			dias = leia.nextInt();
			
			anos = anos * 365;
			
			meses = meses * 30; //considerando meses com 30 dias;
			
			totalDias = anos + meses + dias;
			
			System.out.println("\nVoc� viveu " + totalDias + " dias at� hoje!");
		}
			
	
	
	}
	

}
