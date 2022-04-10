package ProjetoJAVA;

public class TesteLaura {
    private String servido;
    private int sabor;
    private int aspecto;
    protected String comentario;
    private String comerTudo;
    
    public TesteLaura(String servido, int sabor, int aspecto, String comerTudo, String comentario) {
		super();
		this.servido = servido;
		this.sabor = sabor;
		this.aspecto = aspecto;
		this.comentario = comentario;
		this.comerTudo=comerTudo;
	}
    

    //("Sim",5,5,"Sim","Achei muito gostoso");
    //("N�o",5,5,"N�o","Achei apetitoso");
    //public void topoMenu("aqui dentro vai a op��o referente ao menu);
    //Sysout normal para printar isso no t�tulo
	public void Menu() {
   	System.out.println("\nResponda sim ou n�o para a pergunta a seguir. Foi servido mistura hoje?");
   	if(servido=="Sim") {
   		System.out.println("\nO que voc� achou do sabor? Responda de 1 a 5.");
   		switch(sabor) {
   		case 1:
   			System.out.println("\nNota 1.P�ssimo!!");
   			break;
   		case 2:
   			System.out.println("\nNota 2. Ruim!!");
   			break;
   		case 3:
   			System.out.println("\nNota 3.Regular!!");
   			break;
   		case 4:
   			System.out.println("\nNota 4. Bom!!");
   		case 5:
   			System.out.println("\nNota 5. �timo!!");
   		default:
   			System.out.println("\nValor inv�lido!!Tente novamente");
   			break;
   		}
   	    }else if(servido=="N�o") {
   			System.out.println("\nN�o teve mistura hoje");
   		}else {
   			System.out.println("\nValor inv�lido");
   		}
   	System.out.println("\nO que voc� achou dos aspectos?Responda de 1 a 5.");
   	
   	switch(aspecto) {
		case 1:
			System.out.println("\nNota 1.P�ssimo!!");
			break;
		case 2:
			System.out.println("\nNota 2. Ruim!!");
			break;
		case 3:
			System.out.println("\nNota 3.Regular!!");
			break;
		case 4:
			System.out.println("\nNota 4. Bom!!");
		case 5:
			System.out.println("\nNota 5.�timo!!");
		default:
			System.out.println("\nValor inv�lido!!Tente novamente");
			break;
		}
   	
   	System.out.println("\nVoc� costuma comer tudo?Responda com sim ou n�o");
   	if(comerTudo=="Sim") {
   		System.out.println("\nParab�ns!!");
   	}else if(comerTudo=="N�o") {
   		System.out.println("\nUma pena!!");
   	}else {
   		System.out.println("\nColoque um valor v�lido!!");
   	}
   	System.out.println("\nFa�a um coment�rio(opcional): "+comentario);
    }
	
	public void Resultado(){
		System.out.println("\nFoi servido mistura hoje?: "+servido+
				"\nO que voc� achou do sabor?Responda de 0 a 5: "+sabor+
				"\nO que voc� achou dos aspectos?Responda de 0 a 5: "+aspecto+
				"\nVoc� costuma comer tudo?Responda com sim ou n�o: "+comerTudo);
	}




	public String getServido() {
		return servido;
	}




	public void setServido(String servido) {
		this.servido = servido;
	}
}



