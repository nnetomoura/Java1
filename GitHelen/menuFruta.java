package GitHelen;

import java.util.Scanner;

public abstract class menuFruta extends todosOsMetodos { //cria uma subclasse e coloca essa como extens?o

	public menuFruta() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override //sobrescrevendo de ''todosOsMetodos''
	public void tipoMenu() {
		int pessimo=0, ruim=0, razoavel=0, bom=0, excelente=0; 
		int numero;
		do {
			
			System.out.println("****Avalie o menu abaixo de acordo com a sua opini?o****");
			System.out.println("I. Menu de frutas ");
			System.out.println("Qual a sua nota para as frutas servidas na escola? ");
			System.out.println("1. P?ssimo" + "\n2. Ruim" + "\n3. Razo?vel " 
					+ "\n4. Bom"+"\n5. Excelente");
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite a op??o escolhida: ");
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
				if (numero<1 || numero>5)
				{
					System.out.println("\nATEN??O: Op??o inv?lida. Escolha um n?mero de 1 a 5.");
				}
				break;
					} 
				}while (numero<1 || numero>5);
	}

	@Override
	abstract public void aspectoComida(); 
	{
		int pessimo=0, ruim=0, razoavel=0, bom=0, excelente=0; 
		int numero;
		do {
			System.out.println("Sobre o aspecto visual das frutas servidas na escola: Que nota voc? daria?" );
			System.out.println("1. P?ssimo" + "\n2. Ruim" + "\n3. Razo?vel " 
					+ "\n4. Bom"+"\n5. Excelente");
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite a op??o escolhida: ");
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
				if (numero<1 || numero>5)
				{
					System.out.println("\nATEN??O: Op??o inv?lida. Escolha um n?mero de 1 a 5.");
				}
				break;
					} 
				}while (numero<1 || numero>5);
	
	}
	@Override
	abstract public void frequenciaComida();
	{
	int sim=0, nao=0;
	int numero; 
		do {		
			System.out.println("As frutas vem sendo servidas com frequ?ncia?");
			System.out.println("1. Sim" + "\n2. N?o");
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite a op??o escolhida: ");
			 numero = leia.nextInt();
		switch (numero) 
			{
			case 1:
				sim++; //10% 100 = 100 * 0,1
				break;
			case 2: 
				nao++;
				break;
			default: 
				if (numero<1 || numero>2)
				{
					System.out.println("\nATEN??O: Op??o inv?lida. Escolha a op??o 1 (um) ou 2 (dois).");
				}
				break;
					} 
				}while (numero<1 || numero>2);
				
	}
	@Override
	abstract public void comerTudo(); 
	{
		int sim=0, nao=0;
		int numero; 
			do {		
				System.out.println("Voc? costuma comer todas as frutas? ");
				System.out.println("1. Sim" + "\n2. N?o");
				Scanner leia = new Scanner(System.in);
				System.out.println("Digite a op??o escolhida: ");
				 numero = leia.nextInt();
			switch (numero) 
				{
				case 1:
					sim++; //10% 100 = 100 * 0,1
					break;
				case 2: 
					nao++;
					break;
				default: 
					if (numero<1 || numero>2)
					{
						System.out.println("\nATEN??O: Op??o inv?lida. Escolha a op??o 1 (um) ou 2 (dois).");
					}
					break;
						} 
					}while (numero<1 || numero>2);
	}
	



}
