package ex11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); 
		
		ArrayList<Frontend> listaFront = new ArrayList<>();
		ArrayList<Backend> listaBack = new ArrayList<>();
		
		Frontend f = new Frontend();
		Backend b = new Backend();
		
		int id = 0, opcao = 0, qtdeTec = 0, i;
		String linguagem="", principalFrame="", descricaoFrame="", descricaoLin="", compativel = "", posContein="";
		
		do {
			try {
			System.out.printf("\nDeseja cadastrar ou consultar?\n"
							+ "1 - Cadastrar"
							+ "\n2 - Consultar"
							+ "\n3 - Sair\n");
			opcao=ler.nextInt();
			}catch(InputMismatchException e) {
				System.out.printf("\nInsira uma opção valida!");
			}
			
			
			if(opcao==1) {
				
				
				try {
					System.out.printf("\nQuantas tecnologias deseja cadastrar?");
					qtdeTec = ler.nextInt();
				}catch(InputMismatchException e) {
					System.out.print("\nInsira um valor valido");
				}
				
				
				for(i=0; i<qtdeTec; i++) {
					
					
					try {
						System.out.printf("\nQual tecnologia deseja cadastrar?"
										+ "\n1 - Frontend"
										+ "\n2 - Backend\n");
						opcao=ler.nextInt();
					}catch(InputMismatchException e) {
						System.out.printf("insira uma opção valida!");
					}
					
					if(opcao==1) {
						
						try {
							id = listaFront.size()+1;
							System.out.printf("Qual o nome da linguagem?");
							linguagem = ler.next();
							
							System.out.printf("\nQual o principal framework da linguagem?");
							principalFrame = ler.next();
							
							System.out.printf("\nDe uma breve descrição sobre a linguagem: ");
							descricaoLin = ler.next();
							
							System.out.printf("\nDe uma breve descrição sobre o principal framework da linguagem: ");
							descricaoFrame = ler.next();
							
							System.out.printf("\nEssa linguagem é compativel com quais plataformas? ");
							compativel = ler.next();
							
							f.setCompativel(compativel);
							f.setDescricaoFramework(descricaoFrame);
							f.setDescricaoLinguagem(descricaoLin);
							f.setLinguagemProg(linguagem);
							f.setPrincipalFramework(principalFrame);
							f.setId(id);
							
							listaFront.add(f);
						
						}catch(InputMismatchException e) {
							System.out.printf("\ninsira uma informação valida!");
						}
					}
					if(opcao==2) {
						try {
							id = listaFront.size()+1;
							System.out.printf("\nQual o nome da linguagem?");
							linguagem = ler.next();
							
							System.out.printf("\nQual o principal framework da linguagem?");
							principalFrame = ler.next();
							
							System.out.printf("\nDe uma breve descrição sobre a linguagem: ");
							descricaoLin = ler.next();
							
							System.out.printf("\nDe uma breve descrição sobre o principal framework da linguagem: ");
							descricaoFrame = ler.next();
							
							System.out.printf("\nÉ possivel conteinizar essa linguagem? ");
							posContein = ler.next();
							
							b.setPosContein(posContein);
							b.setDescricaoFramework(descricaoFrame);
							b.setDescricaoLinguagem(descricaoLin);
							b.setLinguagemProg(linguagem);
							b.setPrincipalFramework(principalFrame);
							b.setId(id);
							
							listaBack.add(b);
						
						}catch(InputMismatchException e) {
							System.out.printf("\ninsira uma informação valida!");
						}
						opcao=0;
					}
				}
			}
		if(opcao==2) {
			System.out.printf("---Backend---");
			for(Backend e:listaBack) {
				System.out.printf("\nTecnologia: %s - Principal Framework: %s \n Descri��o da tecnologia: %s\n Descri��o do Framework: %s \n",e.getLinguagemProg(),e.getPrincipalFramework(),e.getDescricaoLinguagem(),e.getDescricaoFramework());
			}
			System.out.printf("---Frontend---");
			for(Frontend e:listaFront) {
				System.out.printf("\nTecnologia: %s - Principal Framework: %s \n Descri��o da tecnologia: %s\n Descri��o do Framework: %s \n ",e.getLinguagemProg(),e.getPrincipalFramework(),e.getDescricaoLinguagem(),e.getDescricaoFramework());
			}
		}
		}while(id!=3);
	}
}




