package ex07;

public class ContaCorrente extends Conta implements Sacar{
	private double ChequeEspecial;

	public double getChequeEspecial() {
		return ChequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		ChequeEspecial = chequeEspecial;
	}	
	
	public ContaCorrente() {}
	public ContaCorrente(String agencia, String numero, double saldo, int id, double chequeEspecial){
		super(agencia, numero, saldo, id);
		this.ChequeEspecial=chequeEspecial;
		
	}
	//OVERRIDE
	public void Depositar(double valor) {
		this.setSaldo(this.getSaldo()+valor+this.ChequeEspecial);
	}

	public void Sacar(double valor) {
		this.setSaldo(this.getSaldo()-valor);
	}
}
