package Familia512;

import java.util.Scanner;

public class PrimeiraListaQuatroJava {

	/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e 
	 * calcule a seguinte express�o: 
	 * D=R+S/2, onde R = (A+B)� e S = (B+C)�.
	 * 
	 */
	
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);	
		
		double A, B, C, D, R, S;
		
		System.out.println("\nInsira o valor de A: ");
		A = leia.nextInt();
		System.out.println("\nInsira o valor de B: ");
		B = leia.nextInt();
		System.out.println("\nInsira o valor de C: ");
		C = leia.nextInt();
		
		R = Math.pow((A+B), 2);
		S = Math.pow(B+C, 2);
		D = (R + S)/2;
		
		System.out.printf("\nMedia aritm�tica arredondada: %2.2f" , D ,".");
		
		
				
		
	}

}
