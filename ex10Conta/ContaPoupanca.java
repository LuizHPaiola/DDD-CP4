package ex10Conta;

public class ContaPoupanca extends Conta implements Sacar{
	private double rentabilidade;

	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	public ContaPoupanca() {}
	public ContaPoupanca(String agencia, String numero, double saldo, int id, double rentabilidade) {
		super(agencia, numero, saldo, id);
		this.rentabilidade=rentabilidade;
	}
	
	public void Depositar (double valor) {
		this.setSaldo(this.getSaldo()+(valor*this.rentabilidade));
	}

	public void Sacar(double valor) {
		this.setSaldo(this.getSaldo()-valor);
	}
}
