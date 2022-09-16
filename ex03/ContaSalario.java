package ex03;

public class ContaSalario extends Conta {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public ContaSalario() {}
	public ContaSalario(String agencia, String numero, double saldo, int id, double salario) {
		super(agencia,numero,saldo,id);
		this.salario=salario;
	}
	
	public void Depositar(double valor) {
		this.setSaldo(this.getSaldo()+valor+this.salario);
	}
}
