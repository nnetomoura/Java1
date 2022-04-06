package Arrays;

import java.util.Scanner;

public class QuartaQuestaoArray {

	public static void main(String[] args) {
		
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		
		float num;
		int i,j,op;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nEntre com o valor da matriz 1: ");
				matriz1[i][j] = leia.nextFloat();
				System.out.println("\nEntre com o valor da matriz 2: ");
				matriz2[i][j] = leia.nextFloat();
				System.out.println("\nEntre com o valor da matriz 3: ");
				matriz3[i][j] = leia.nextFloat();				
			}
		}
	
		
		do {
			System.out.println("\nEscolha uma opção: " );
			System.out.println("\n1- Somar as duas matrizes.");
			System.out.println("\n2- Subtrair a primeira matriz da segunda.");
			System.out.println("\n3- Adicionar uma constante as duas matrizes.");
			System.out.println("\n4- Imprimir as matrizes.");
			System.out.println("\n0 - Sair do sistema.");
			op = leia.nextInt();
			
			switch(op) {
			
			case 1:
				
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						System.out.println("\nsoma das matrizes "+matriz3[i][j] );
					}				
				}
				
				break;
				
				
			case 2:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
						System.out.println("\nSubtração das matrizes "+matriz3[i][j] );
					}				
			}
				
				break;
				
			case 3:
				
				System.out.println("\nInforme o valor da constante: ");
				num = leia.nextFloat();
				
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz1[i][j] += num;
						matriz2[i][j] += num;
						System.out.println("\nmatriz1 " + matriz1[i][j]);
						System.out.println("\nmatriz2 " + matriz2[i][j]);
						}
					}
				break;
				
			case 4:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						
						System.out.println("\nmatriz1 " + matriz1[i][j]);
						System.out.println("\nmatriz2 " + matriz2[i][j]);
						}
					}
				
				break;
			default:
				if(op <0 || op>4) {
					
					System.out.println("\nOpção inválida");
					
				}else if(op == 0) {
					System.out.println("\nSaindo do sistema");
					
				}else {
					System.out.println("\nVoltando ao menu");
				}
									
			}			
			
		}while(op!=0);
		
		
	}
}
