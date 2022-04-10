package ProjetoJAVA;

public abstract class Menu {
	
		protected String servido; //se a comida foi servida
		protected String sabor; //sabor da comida
		protected String aspectoVisual; //aspecto visual da comida
		protected String comerTudo; //se o aluno comeu tudo
		protected String tituloMenu;
		protected int opcMenu;
		
		public Menu(String servido, String sabor, String aspectoVisual, 
				String comerTudo, String tituloMenu, int opcMenu) 
		
		
		{
			this.servido = servido;
			this.sabor = sabor;
			this.aspectoVisual = aspectoVisual;
			this.comerTudo = comerTudo;
			this.tituloMenu = tituloMenu;
			this.opcMenu = opcMenu;
		}
		public String getServido() {
			return servido;
		}
		public void setServido(String servido) {
			this.servido = servido;
		}
		public String getSabor() {
			return sabor;
		}
		public void setSabor(String sabor) {
			this.sabor = sabor;
		}
		public String getAspectoVisual() {
			return aspectoVisual;
		}
		public void setAspectoVisual(String aspectoVisual) {
			this.aspectoVisual = aspectoVisual;
		}
		public String getComerTudo() {
			return comerTudo;
		}
		public void setComerTudo(String comerTudo) {
			this.comerTudo = comerTudo;
		}
				
		public String getTituloMenu() {
			return tituloMenu;
		}
		public void setTituloMenu(String tituloMenu) {
			this.tituloMenu = tituloMenu;
		}
			
		public int getOpcMenu() {
			return opcMenu;
		}
		public void setOpcMenu(int opcMenu) {
			this.opcMenu = opcMenu;
		}
		
		//métodos polimórficos
		
		abstract public void menu(String tituloMenu);
		{
			System.out.println("\n****Avalie a(o) item " + tituloMenu + "****");
		}
		
		abstract public void corpoMenu(int opcMenu);
		{
			
	do {
			switch (opcMenu) 
			{
			case 1:
				System.out.println("1. Excelente");
				break;
			case 2: 
				System.out.println("2. Bom");
				break;
			case 3:
				System.out.println("3. Razoável");
				break;
			case 4:
				System.out.println("4. Ruim");
				break;
			case 5: 
				System.out.println("5. Péssimo");
			
				default: 
					{						
						System.out.println("Opção inválida!!!");
					}
					break;
				}
			
		} while (opcMenu!=1 || opcMenu!=5);
			
			
		
		
		
		
		}
		
		/* Péssimo
		 * Ruim
		 * Razoável
		 * Bom
		 * Excelente
		 * /
		 */
		
		
		
		
		
}


	
