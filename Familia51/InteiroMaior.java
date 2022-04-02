package Familia51;

import java.util.Scanner;

public class InteiroMaior {

	/*
	 MENOR		MEIO		MAIOR
	 A 			B			C
	 A 			C			B
	 B 			A			C
	 B 			C			A
	 C 			A			B
	 C 			B			A
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("\nInsira o valor de b: ");
		b = leia.nextInt();
		
		System.out.println("\nInsira o valor de c: ");
		c = leia.nextInt();
		
		
		if (a<=b && b<=c) 
		{
			System.out.println("\nOrdem crescente: " + a + ", " + b + ", " + c);
		}
		
		else if (a<=c && c<=b)
		{
			System.out.println("\nOrdem crescente: " + a + ", " + c + ", " + ", " + b);
						
		}
		else if (b<=a && a<=c) 
		{
			System.out.println("\nOrdem crescente: " + b + ", " + a + ", " + c);
		}
		
		else if (b<=c && c<=a) 
		{
			System.out.println("\nOrdem crescente: " + b + ", " + c + ", " + a);
		}
		
		else if (c<=a && a<=b) 
		{
			System.out.println("\nOrdem crescente: " + c + ", " + a + ", " + b);
		}
		else if (c<=b && b<=a)
		{
			System.out.println("\nOrdem crescente: " + c +  ", " + b + ", " + a);
		}
		
		
			
	}

}
