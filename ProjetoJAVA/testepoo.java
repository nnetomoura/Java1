package ProjetoJAVA;



public class testepoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        TesteLaura pessoa1 = new TesteLaura("Sim",5,5,"Sim","Achei muito gostoso"); 
	        TesteLaura pessoa2 = new TesteLaura("N�o",5,5,"N�o","Achei apetitoso");     
	    	        
			System.out.println("*****Avalia��o mistura*****");//vai virar m�todo
			System.out.println("1. Excelente" + "\n2. Bom " + "\n3. Razo�vel " 
					+ "\n4. Ruim"+"\n5. P�ssimo"); 
	        pessoa1.Menu();
	        pessoa2.Menu();
	        pessoa1.Resultado();
	        pessoa2.Resultado();
	        
	        
		}

	}