package ex10Conta;

public  class Conta {
	private String agencia, numero;
	private double saldo;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	protected String exibirMensagem() {
		return "Ol�, bem vindo ao sistema de cadastro!";
	}
	
	public Conta(){}
	public Conta(String agencia, String numero, double saldo, int id){
		this.agencia=agencia;
		this.numero=numero;
		this.saldo=saldo;
		this.id=id;
	}
	
	public void Depositar(double valor) {
		this.saldo=this.saldo+valor;
	}
	//OVERLOAD
	public void Depositar(double valor, double taxa) {
		this.saldo=this.saldo+(valor-taxa);
	}
		
	}

