package ex06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Sistema {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		int opcao, id, idade;
		String nome, sobrenome, cpf, endereco, cnpj, razaoSocial;
		ArrayList<PessoaFisica> listaPf = new ArrayList<>();
		ArrayList<PessoaJuridica> listaPj = new ArrayList<>();
		
		do {
			System.out.printf("\nSistema de cadastro de pessoas. informe a opção desejada: "
							+ "\n1 - Pessoa Fisica"
							+ "\n2 - Pessoa Juridica"
							+ "\n3 - Consultar pessoas"
							+ "\n4 - Alterar dados"
							+ "\n5 - Sair");
			opcao=ler.nextInt();
			
			if(opcao==1) {
				PessoaFisica p = new PessoaFisica();
				id = listaPf.size()+1;
				System.out.printf("\nInforme o nome: ");
				nome = ler.next();
				System.out.printf("\nInforme o sobrenome:");
				sobrenome = ler.next();
				System.out.printf("\nInforme o endereço: ");
				endereco = ler.next();
				System.out.printf("\nInforme a idade: ");
				idade=ler.nextInt();
				System.out.printf("\nInforme o CPF: ");
				cpf=ler.next();
				
				p.setNome(nome);
				p.setIdade(idade);
				p.setId(id);
				p.setSobrenome(sobrenome);
				p.setCpf(cpf);
				p.setEndereco(endereco);
				listaPf.add(p);
				
			}
			else if(opcao==2) {
				PessoaJuridica p = new PessoaJuridica();
				id = listaPj.size()+1;
				System.out.printf("\nInforme o nome: ");
				nome = ler.next();
				System.out.printf("\nInforme o endereço: ");
				endereco = ler.next();
				System.out.printf("\nInforme o CNPJ: ");
				cnpj=ler.next();
				System.out.printf("\nInforme a Razão Social: ");
				razaoSocial= ler.next();
				
				p.setNome(nome);
				p.setId(id);
				p.setEndereco(endereco);
				p.setCnpj(cnpj);
				p.setRazaoSocial(razaoSocial);
				listaPj.add(p);
			}
			else if(opcao==3) {
				System.out.printf("\nInforme qual lista você deseja ver: "
								+ "\n1 - Pessoa Física"
								+ "\n2 - Pessoa Jurídica");
				opcao=ler.nextInt();
				if(opcao==1) {
					for(PessoaFisica a: listaPf) {
						System.out.printf("\nID: %d - NOME: %s - SOBRENOME: %s -  ENDEREÇO: %s - IDADE: %d - CPF: %s", a.getId(),a.getNome(),a.getSobrenome(),a.getEndereco(),a.getIdade(),a.getCpf());
					}
					System.in.read();
				}
				else if(opcao==2) {
			    	for(PessoaJuridica a : listaPj) {
			    		System.out.printf("\nID: %d - NOME: %s - ENDEREÇO: %s - RAZÃO SOCIAL: %s - CNPJ: %s",a.getId(),a.getNome(),a.getEndereco(),a.getRazaoSocial(),a.getCnpj());
			    	}
			    	System.in.read();
			    }
				//aoba 
			}else if(opcao==4){
				System.out.printf("\nInforme qual tipo de pessoa você deseja alterar: "
								+ "\n1 - Pessoa Física"
								+ "\n2 - Pessoa Jurídica");
				opcao=ler.nextInt();
				if(opcao==1) {
					for(PessoaFisica a: listaPf) {
						System.out.printf("\nID: %d - NOME: %s - SOBRENOME: %s -  ENDEREÇO: %s - IDADE: %d - CPF: %s", a.getId(),a.getNome(),a.getSobrenome(),a.getEndereco(),a.getIdade(),a.getCpf());
					}
					System.out.printf("Informe a pessoa que deseja alterar: ");
					id=ler.nextInt();
					
					PessoaFisica a = listaPf.get(id-1);
					
					System.out.printf("Informe a nova idade: ");
					idade=ler.nextInt();
					
					System.out.printf("Informe o novo sobrenome: ");
					sobrenome=ler.next();
					
					a.alteraDados(idade,sobrenome);
				}
				else if(opcao==2) {
			    	for(PessoaJuridica a : listaPj) {
			    		System.out.printf("\nID: %d - NOME: %s - ENDEREÇO: %s - RAZÃO SOCIAL: %s - CNPJ: %s",a.getId(),a.getNome(),a.getEndereco(),a.getRazaoSocial(),a.getCnpj());
			    	}
			    	System.out.printf("Informe a pessoa que deseja alterar: ");
					id=ler.nextInt();
					
					PessoaJuridica a = listaPj.get(id-1);
					
					System.out.printf("Informe o novo CNPJ: ");
					cnpj=ler.next();
					
					System.out.printf("Informe a nova Razão Social: ");
					razaoSocial=ler.next();
					
					a.alteraDados(cnpj,razaoSocial);
				}
			}
			
		}while(opcao!=5);
		ler.close();
	}

}
