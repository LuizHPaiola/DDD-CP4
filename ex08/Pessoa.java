package ex08;

public  class Pessoa {
	private int id;
	private String nome, endereco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	Pessoa(){}
	Pessoa(int id, String nome, String endereco){
		this.id=id;
		this.endereco=endereco;
		this.nome=nome;
	}
	
	public void alteraDados(String novoNome) {
		this.nome=novoNome;
	}
	
	public void alteraDados(String novoNome, String novoEndereco) {
		this.endereco=novoEndereco;
	}
}
