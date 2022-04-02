package Familia51;

import java.util.Scanner;

public class IdadeAlunoIfElse {

	/*  Questão 3 - Escreva um sistema que receba numeros e devolva a categoria baseada na idade! 
	categorias: 10-14 infantil, 15-17 juvenil, 18-25 adulto*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		
		Scanner leia= new Scanner(System.in); 
				
		System.out.println("\nInsira a idade do alune: "); //entrada de dados, equivalente ao escreva;
		idade = leia.nextInt(); //para ler a entrada, equivalente a função leia;
				
		
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("\nO Alune é do grupo INFANTIL!");
		}
		
		else if (idade>=15 && idade<=17)
		{
			System.out.println("\nO Alune do grupo JUVENIL!");
		}
		
		else if (idade>=18 && idade<=25) //hipoteticamente: os adultos vão somente até 25 anos, como pede o exercício.
		{
		System.out.println("\nO alune é do grupo ADULTO!");
		}
		else
		{
			System.out.println("\nATENÇÃO: Nenhum grupo está associado a esta idade. Vá arecepção para mais informações!");
		}
		
			
		
		
	}
	

}
