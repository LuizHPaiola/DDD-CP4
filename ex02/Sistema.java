package ex02;

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
							+ "\n4 - Sair");
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
			if(opcao==2) {
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
			if(opcao==3) {
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
			    if(opcao==2) {
			    	for(PessoaJuridica a : listaPj) {
			    		System.out.printf("\nID: %d - NOME: %s - ENDEREÇO: %s - RAZÃO SOCIAL: %s - CNPJ: %s",a.getId(),a.getNome(),a.getEndereco(),a.getRazaoSocial(),a.getCnpj());
			    	}
			    	System.in.read();
			    }
			}
			
		}while(opcao!=4);
		ler.close();
	}

}
