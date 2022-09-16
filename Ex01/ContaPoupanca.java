package Ex01;

public class ContaPoupanca extends Conta{
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
}
