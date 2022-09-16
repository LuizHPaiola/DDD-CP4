package ex05;

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
	
	public void Depositar (double valor) {
		this.setSaldo(this.getSaldo()+(valor*this.rentabilidade));
	}

	@Override
	public void Sacar() {
		// TODO Auto-generated method stub
		
	}
}
