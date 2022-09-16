package ex08;

public class PessoaJuridica extends Pessoa implements AlteraDados{
	private String cnpj, razaoSocial;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public PessoaJuridica() {
	}
	
	PessoaJuridica(int id, String nome, String endereco, String cnpj, String razaoSocial){
		super(id, nome, endereco);
		this.cnpj=cnpj;
		this.razaoSocial=razaoSocial;
	}

	public void alteraDados(String cnpj) {
		this.setCnpj(cnpj);
	}
	public void alteraDados(String cnpj, String razaoSocial) {
		this.setRazaoSocial(razaoSocial);
	}

}
