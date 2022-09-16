package ex02;

public class PessoaJuridica extends Pessoa {
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
	
	PessoaJuridica(int id, String nome, String endereco, String cnpj, String razaoSocial){
		super(id, nome, endereco);
		this.cnpj=cnpj;
		this.razaoSocial=razaoSocial;
	}

	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}

}
