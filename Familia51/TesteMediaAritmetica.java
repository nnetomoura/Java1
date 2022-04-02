package Familia51;

import java.util.Scanner;

public class TesteMediaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3, mediaAritmetica;
		
		Scanner leia = new Scanner(System.in); 
				
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
				
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		mediaAritmetica = (n1+n2+n3)/3;
		
		System.out.println("\nA média aritmética foi de: " + mediaAritmetica);
		System.out.printf("\nMedia aritmética arredondada % 2.2f", mediaAritmetica); 
		
		

	}

}
