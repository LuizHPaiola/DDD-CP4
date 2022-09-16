package Ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Sistema {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		
		ArrayList<ContaCorrente> listaContaCorrente = new ArrayList<>();
		ArrayList<ContaPoupanca> listaContaPoupanca = new ArrayList<>();
		ArrayList<ContaSalario> listaContaSalario = new ArrayList<>();
		
		String agencia, numero;
		double salario, rentabilidade, chequeEspecial, saldo;
		int id, opcao;
		
		do {
		System.out.printf("\nBem vindo ao sistema de cadastro de contas! Informe a opção desejada:\n"
						+ "1 - Registrar Conta\n"
						+ "2 - Apagar Conta\n"
						+ "3 - Consultar Conta\n"
						+ "4 - Sair");
		opcao=ler.nextInt();
		//inicio cadastro conta
		if(opcao==1) {
			System.out.printf("\nQual o tipo da conta a ser registrada?\n"
							+ "1 - Conta Corrente\n"
							+ "2 - Conta Poupança\n"
							+ "3 - Conta Salário\n");
			opcao=ler.nextInt();
			if(opcao==1) {
				ContaCorrente cc = new ContaCorrente();
				
				id=listaContaCorrente.size()+1;
				cc.setId(id);
				
				System.out.printf("\nInforme a agência da conta: ");
				agencia=ler.next();
				cc.setAgencia(agencia);
				
				System.out.printf("\nInforme o número da conta: ");
				numero=ler.next();
				cc.setNumero(numero);
				
				System.out.printf("\nInforme o saldo da conta: ");
				saldo=ler.nextDouble();
				cc.setSaldo(saldo);
				
				System.out.printf("\nInforme o valor do cheque especial: ");
				chequeEspecial=ler.nextDouble();
				cc.setChequeEspecial(chequeEspecial);
				
				listaContaCorrente.add(cc);
			}
			else if(opcao==2) {
				ContaPoupanca cp = new ContaPoupanca();
				
				id=listaContaPoupanca.size()+1;
				cp.setId(id);
				
				System.out.printf("\nInforme a agência da conta: ");
				agencia=ler.next();
				cp.setAgencia(agencia);
				
				System.out.printf("\ninforme o número da conta: ");
				numero=ler.next();
				cp.setNumero(numero);
				
				System.out.printf("\nInforme o saldo da conta: ");
				saldo=ler.nextDouble();
				cp.setSaldo(saldo);
				
				System.out.printf("\nInforme a rentabilidade da conta: ");
				rentabilidade=ler.nextDouble();
				cp.setRentabilidade(rentabilidade);
				
				listaContaPoupanca.add(cp);
			}
			else if(opcao==3) {
				ContaSalario cs = new ContaSalario();
				
				id=listaContaSalario.size()+1;
				cs.setId(id);
				
				System.out.printf("\nInforme a agência da conta: ");
				agencia=ler.next();
				cs.setAgencia(agencia);
				
				System.out.printf("\nInforme o número da conta: ");
				numero=ler.next();
				cs.setNumero(numero);
				
				System.out.printf("\nInforme o saldo da conta: ");
				saldo=ler.nextDouble();
				cs.setSaldo(saldo);
				
				System.out.printf("\nInforme o seu salário: ");
				salario=ler.nextDouble();
				cs.setSalario(salario);
				
				listaContaSalario.add(cs);
			}
			//Fim cadastro conta
		}
		//Inicio apagar conta
		else if(opcao==2) {
			System.out.printf("\nQual o tipo da conta a ser apagada?\n"
					+ "1 - Conta Corrente\n"
					+ "2 - Conta Poupança\n"
					+ "3 - Conta Salário\n");
			opcao=ler.nextInt();
			if(opcao==1) {
				for(ContaCorrente a:listaContaCorrente) {
					System.out.printf("\nID: %d - NUMERO: %s - AG: %s - SALDO: %f - C.ESPECIAL: %f",a.getId(),a.getNumero(),a.getAgencia(),a.getSaldo(),a.getChequeEspecial());
				}
				
				System.out.printf("\nInforme a conta a ser apagada: ");
				
				id=ler.nextInt()-1;
				listaContaCorrente.remove(id);
				
				System.out.printf("\nConta apagada com sucesso!");
				System.in.read();
				
			}else if(opcao==2) {
				for(ContaPoupanca a:listaContaPoupanca) {
					System.out.printf("\nID: %d - NUMERO: %s - AG: %s - SALDO: %f - RENT.: %f",a.getId(),a.getNumero(),a.getAgencia(),a.getSaldo(),a.getRentabilidade());
				}
				
				System.out.printf("\nInforme a conta a ser apagada: ");
				
				id=ler.nextInt()-1;
				listaContaPoupanca.remove(id);
				
				System.out.printf("\nConta apagada com sucesso!");
				System.in.read();
				
			}else if(opcao==3) {
				for(ContaSalario a:listaContaSalario) {
					System.out.printf("\nID: %d - NUMERO: %s - AG: %s - SALDO: %f - SALARIO: %f",a.getId(),a.getNumero(),a.getAgencia(),a.getSaldo(),a.getSalario());
				}
				
				System.out.printf("\nInforme a conta a ser apagada: ");
				
				id=ler.nextInt()-1;
				listaContaSalario.remove(id);
				
				System.out.printf("\nConta apagada com sucesso!");
				System.in.read();
				
			}
		//Fim apagar conta	
		}
		//Inicio consultar conta
		else if(opcao==3) {
			System.out.printf("\nQual o tipo da conta a ser apagada?\n"
					+ "1 - Conta Corrente\n"
					+ "2 - Conta Poupança\n"
					+ "3 - Conta Salário\n");
			opcao=ler.nextInt();
			if(opcao==1) {
				for(ContaCorrente a:listaContaCorrente) {
					System.out.printf("\nID: %d - NUMERO: %s - AG: %s - SALDO: %f - C.ESPECIAL: %f",a.getId(),a.getNumero(),a.getAgencia(),a.getSaldo(),a.getChequeEspecial());
					
				}
				System.in.read();
			}
			else if(opcao==2) {
				for(ContaPoupanca a:listaContaPoupanca) {
					System.out.printf("\nID: %d - NUMERO: %s - AG: %s - SALDO: %f - RENT.: %f",a.getId(),a.getNumero(),a.getAgencia(),a.getSaldo(),a.getRentabilidade());
					
				}
				System.in.read();
			}
			else if(opcao==3) {
				for(ContaSalario a:listaContaSalario) {
					System.out.printf("\nID: %d - NUMERO: %s - AG: %s - SALDO: %f - SALARIO: %f",a.getId(),a.getNumero(),a.getAgencia(),a.getSaldo(),a.getSalario());
					
				}
				System.in.read();
			}
		//Fim consultar conta	
		}
		
		}while(opcao!=4);
	}

}
