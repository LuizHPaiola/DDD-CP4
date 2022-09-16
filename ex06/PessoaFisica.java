package ex06;

public class PessoaFisica extends Pessoa {
	private int idade;
	private String cpf, sobrenome;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	PessoaFisica() {
	}
	
	PessoaFisica(int id, String nome, String endereco, int idade, String cpf, String sobrenome){
		super(id,nome,endereco);
		this.idade=idade;
		this.cpf=cpf;
		this.sobrenome=sobrenome;
	}
	
	
	public void alteraDados(int idade) {
		this.setIdade(idade);
	}
	
	public void alteraDados(int idade, String sobrenome) {
		this.setIdade(idade);
		this.setSobrenome(sobrenome);
	}
}
