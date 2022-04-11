package GitHelen;

public abstract class principal {
	
	protected String funcao;
	
	principal(String funcao){
		this.funcao=funcao;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	abstract void porcentagem(); //porcentagem resultado;
	
	abstract public void comentario(); //comentário geral;
	


	
	
	
	
	
}
