package Arrays;

public class PrimeiraQuestaoArray {

	public static void main(String[] args) {
	
		int soma;
		int  [] A = new int [6]; // vetor com 6 numeros inteiros, sendo: 1 0 5 -2 -5 7 //se os dados de entrada j� forem conhecidos, � poss�vel fazer: int [] A ={n�meros};
			
		//a)
		A [0] = 1; A [1] = 0; A [2] = 5;  A [3] = -2;  A [4] = -5; A [5] = 7; 
		
		//b)
		soma = A[0] +  A[1] + A[5];
 		
		System.out.println("\nO total da soma proposta �: " + soma);
		
 		A[4] = 100;
		
		// aqui poderia ser um 
 		//for (x=0;x>6;x++)
 		//System.out.print("\nOs valores do vetor A s�o: " + A[x]); e o programa printaria os n�meros de todas as posi��es do vetor;
 		System.out.println("\nOs valores do vetor A s�o : \n" + A[0] + "\n" + A[1] + "\n" + A[2] + "\n" + A[3] + "\n" + A[4] + "\n" + A[5]);
		
		System.out.printf("\nOs valores do vetor A s�o : %d, %d, %d, %d, %d", A[0], A[1], A[2], A[3], A[4], A[5],"."); // de outra forma;
		
	}
	
}
