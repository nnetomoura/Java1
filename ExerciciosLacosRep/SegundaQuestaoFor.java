package ExerciciosLacosRep;

public class SegundaQuestaoFor {

	public static void main(String[] args) 
	{

	double contNum, numeros = 1000;
	int x;
	
	for (numeros=1000;numeros<=1999;numeros++) //o primeiro ''números'' é o ponto de partida do laço de repetição for (para)
	{
			
		contNum = numeros / 11;
		
		if (contNum % 11 == 5)
		{
			System.out.printf("\nNúmeros: ", + numeros);
		}
		
		
	}
	
	
	
	
	}

}
