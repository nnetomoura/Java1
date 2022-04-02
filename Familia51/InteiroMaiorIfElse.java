package Familia51;

import java.util.Scanner;

public class HelloWorld {
//public: o main tem acesso a todas as classes, e  qualquer um tem acesso+
//classe main. Static = estático; main = ele dará o ponto de execução para o sistema;
//String: o ''[]'' significa vetor. O mesmo do portugol.
//public static void main é uma ESTRUTURA e não recebe ponto e vírgula.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//float é o mesmo que REAL no portugol
		
		float nota1, nota2, nota3, media;
//para o scanner ser utilizado, foi necessário importar a biblioteca.
//nesta caso funciona como o ''leia'' do portugol.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
//o concatenador no java é o "+";
		// 2.2 = duas casas para a esquerda, duas casas para direita		
		System.out.println("\nMedia aritmética: " + media);
		System.out.printf("\nMedia aritmética arredondada: %2.2f",media);

//se = if, senao = else
//o ''e'' no java é &&!
		
		if (media>=7 && media<=10) 
		{
			System.out.println("\nAlune aprovade!!!");
		}
		
		else if (media>=5 && media<7) 
		{
			System.out.println("\nAlune de exame");			
		}
		
		else 
		{
			System.out.println("\nAlune reprovade");
		}
		
		
			

	}

}
