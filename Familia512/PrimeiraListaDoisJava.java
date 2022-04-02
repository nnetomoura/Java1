package Familia512;

import java.util.Scanner;

public class PrimeiraListaDoisJava {

	// 2 - Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
	public static void main(String[] args) {
	
		int totalDias;
		int anos = 0, meses = 0, dias = 0, res = 0;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira a quantidade de dias vividos: ");
		totalDias = leia.nextInt();
		
		anos = totalDias / 365;
		res = totalDias % 365;
		meses = res / 30;
		dias = res % 30;
		
		System.out.println("\nVocê viveu " + anos + " anos, " + meses + " meses, " + "e " + dias + " dias até hoje!");
		 
		
		
		
		
		
	}
	

}
