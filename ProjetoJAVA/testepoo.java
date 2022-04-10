package ProjetoJAVA;



public class testepoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        TesteLaura pessoa1 = new TesteLaura("Sim",5,5,"Sim","Achei muito gostoso"); 
	        TesteLaura pessoa2 = new TesteLaura("Não",5,5,"Não","Achei apetitoso");     
	    	        
			System.out.println("*****Avaliação mistura*****");//vai virar método
			System.out.println("1. Excelente" + "\n2. Bom " + "\n3. Razoável " 
					+ "\n4. Ruim"+"\n5. Péssimo"); 
	        pessoa1.Menu();
	        pessoa2.Menu();
	        pessoa1.Resultado();
	        pessoa2.Resultado();
	        
	        
		}

	}