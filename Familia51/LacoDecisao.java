package Familia51;

import java.util.Scanner;

public class LacoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int = inteiro portugol
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nMenu de elogios!!!");
		System.out.println("\nEscolha qual ser� o seu elogio: ");
		System.out.println("\n1. Acolhedora");
		System.out.println("\n2. Unida");
		System.out.println("\n3. Fam�lia Inteligente");
		System.out.println("\n4. Fam�lia Animada");
		System.out.println("\nPor favor digite sua op��o: ");
		op = ler.nextInt();

//escolha do usu�rio: la�o decis�o escolha caso
		switch(op) //op = vari�vel resposta
		{
		case 1: 
			System.out.println("\nVoc�s s�o acolhedores");
			break;
		case 2: 
			System.out.println("\nVoc�s s�o unides");
			break;
		case 3:
			System.out.println("\nVoc�s s�o inteligentes");
			break;
		case 4:
			System.out.println("\nVoc�s s�o animades!");
			break;
		default: //final do escolha caso. default: caso contr�rio!
			System.out.println("Op��o inv�lida!");
			
			
		}
	}

}
