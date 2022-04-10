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
    //("Não",5,5,"Não","Achei apetitoso");
    //public void topoMenu("aqui dentro vai a opção referente ao menu);
    //Sysout normal para printar isso no título
	public void Menu() {
   	System.out.println("\nResponda sim ou não para a pergunta a seguir. Foi servido mistura hoje?");
   	if(servido=="Sim") {
   		System.out.println("\nO que você achou do sabor? Responda de 1 a 5.");
   		switch(sabor) {
   		case 1:
   			System.out.println("\nNota 1.Péssimo!!");
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
   			System.out.println("\nNota 5. Ótimo!!");
   		default:
   			System.out.println("\nValor inválido!!Tente novamente");
   			break;
   		}
   	    }else if(servido=="Não") {
   			System.out.println("\nNão teve mistura hoje");
   		}else {
   			System.out.println("\nValor inválido");
   		}
   	System.out.println("\nO que você achou dos aspectos?Responda de 1 a 5.");
   	
   	switch(aspecto) {
		case 1:
			System.out.println("\nNota 1.Péssimo!!");
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
			System.out.println("\nNota 5.Ótimo!!");
		default:
			System.out.println("\nValor inválido!!Tente novamente");
			break;
		}
   	
   	System.out.println("\nVocê costuma comer tudo?Responda com sim ou não");
   	if(comerTudo=="Sim") {
   		System.out.println("\nParabéns!!");
   	}else if(comerTudo=="Não") {
   		System.out.println("\nUma pena!!");
   	}else {
   		System.out.println("\nColoque um valor válido!!");
   	}
   	System.out.println("\nFaça um comentário(opcional): "+comentario);
    }
	
	public void Resultado(){
		System.out.println("\nFoi servido mistura hoje?: "+servido+
				"\nO que você achou do sabor?Responda de 0 a 5: "+sabor+
				"\nO que você achou dos aspectos?Responda de 0 a 5: "+aspecto+
				"\nVocê costuma comer tudo?Responda com sim ou não: "+comerTudo);
	}




	public String getServido() {
		return servido;
	}




	public void setServido(String servido) {
		this.servido = servido;
	}
}



