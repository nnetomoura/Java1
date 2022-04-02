package Familia51;

import java.util.Scanner;

public class LacoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int = inteiro portugol
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nMenu de elogios!!!");
		System.out.println("\nEscolha qual será o seu elogio: ");
		System.out.println("\n1. Acolhedora");
		System.out.println("\n2. Unida");
		System.out.println("\n3. Família Inteligente");
		System.out.println("\n4. Família Animada");
		System.out.println("\nPor favor digite sua opção: ");
		op = ler.nextInt();

//escolha do usuário: laço decisão escolha caso
		switch(op) //op = variável resposta
		{
		case 1: 
			System.out.println("\nVocês são acolhedores");
			break;
		case 2: 
			System.out.println("\nVocês são unides");
			break;
		case 3:
			System.out.println("\nVocês são inteligentes");
			break;
		case 4:
			System.out.println("\nVocês são animades!");
			break;
		default: //final do escolha caso. default: caso contrário!
			System.out.println("Opção inválida!");
			
			
		}
	}

}
