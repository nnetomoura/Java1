package GitHelen;

public class Cadastro extends principal {
	
	private String nome;
	private int idade;
	private String cpf;
	private String nascimento;
	public Cadastro(String funcao,String nome,int idade,String cpf,String nascimento) {
			super(funcao);
			this.nome=nome;
			this.idade=idade;
			this.cpf=cpf;
			this.nascimento=nascimento;
	}
	public void nome(String nome) {
		System.out.println("Nome informado: "+getNome());
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void idade(int idade) {
		System.out.println("Idade informada: "+getIdade());
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public void cpf(String cpf) {
		System.out.println("CPF informado: "+getCpf());
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	public void nascimento(String nascimento) {
		System.out.println("A data de nascimento informada: "+getNascimento());
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento=nascimento;
	}
	
	public void perguntas() {
		System.out.println("Informe seu nome: \nInforme sua idade: \nInforme seu CPF: \nInforme sua data de nascimento(Formato 00/00/0000): ");
	}
	
	@Override
	public void resultado(){
		System.out.println("Resumo das respostas: "+getNome()+", "+getIdade()+", "+getCpf()+", "+getNascimento());
	}
}