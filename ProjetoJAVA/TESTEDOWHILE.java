package ProjetoJAVA;

import java.util.Scanner;

public class TESTEDOWHILE {

	public static void main(String[] args) {
			
		 int numero;
		 String ademais;
		 
		 
		 
		 int excelente = 0, bom = 0, razoavel = 0, ruim = 0, pessimo = 0;
	
		 Scanner leia1 = new Scanner (System.in); 
		 
		 //colocar no if as pergs sim ou não;
		 //transformar necessidades em métodos; usando classes abstratas; interface;
		 //tentar encaixar a inserção de dados (só no final); 
		 
		 //criar método para escrever isso;
		do {
			System.out.println("*****Avaliação acompanhamentos*****");
			System.out.println("1. Péssimo" + "\n2. Ruim" + "\n3. Razoável " 
					+ "\n4. Bom"+"\n5. Excelente");
			Scanner leia = new Scanner(System.in);
			System.out.println("Escolha uma opção: ");
			numero = leia.nextInt();
		switch (numero) 
			{
			case 1:
				pessimo++; //10% 100 = 100 * 0,1
				break;
			case 2: 
				ruim++;
				break;
			case 3:
				razoavel++;
				break;
			case 4:
				bom++;
				break;
			case 5: 
				excelente++;
				break;
			default: 
					{						
						System.out.println("\nATENÇÃO: Opção inválida. Escolha um número de 1 a 5.");
					}
					break;
					} 
				}while (numero<1 || numero>5);
		
		/*System.out.println("************Porcentagem geral************"); //Porcetagem = (valor obtido x 100) / valor total (de votos)
		System.out.println(pessimo);
		System.out.println(ruim);
		System.out.println(razoavel);
		System.out.println(bom);
		System.out.println(excelente);*/ 
		//porcentagem: 
			
			
		
	}
	
		
}


