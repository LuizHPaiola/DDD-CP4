package ex10FormasGeo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Quadrado> listaQuadrado = new ArrayList<>();
		ArrayList<Retangulo> listaRetangulo = new ArrayList<>();
		ArrayList<Circulo> listaCirculo = new ArrayList<>();
		int qtdFormas = 0, opcaoForma = 0;
		double lado = 0, base = 0, raio = 0;
		
		System.out.println("Digite a quantidade de formas que deseja criar:");
		
		try {
		qtdFormas = ler.nextInt();
		}catch(InputMismatchException e) {
			System.out.printf("Insira um numero!");
		}
		
		for (int i = 1; i <= qtdFormas; i++) {
			System.out.println("Digite o número correspondente a forma que deseja criar\n" + "1- Quadrado\n"
					+ "2-Retângulo\n" + "3-Círculo\n");
			
			try {
			opcaoForma = ler.nextInt();
			}catch(InputMismatchException e) {
				System.out.printf("Insira um numero!");
			}
			
			}
			if (opcaoForma == 1) {
				System.out.println("Digite o valor da lateral do quadrado:");
				
				try {
				lado = ler.nextDouble();
				}catch(InputMismatchException e) {
					System.out.printf("Insira um numero!");
				
				}
				
				Quadrado quadrado = new Quadrado(lado, lado, lado, lado);
				quadrado.calculoPerimetro();
				quadrado.calculoArea();

				listaQuadrado.add(quadrado);

			} else if (opcaoForma == 2) {
				System.out.println("Digite o valor do lado do retângulo:");
				
				try {
					lado = ler.nextDouble();
					}catch(InputMismatchException e) {
						System.out.printf("Insira um numero!");
					}
				System.out.println("Digite o valor da base do retângulo:");
				try {
					base = ler.nextDouble();
					}catch(InputMismatchException e) {
						System.out.printf("Insira um numero!");

					}

				Retangulo retangulo = new Retangulo(lado, base, lado, base);
				retangulo.calculoPerimetro();
				retangulo.calculoArea();

				listaRetangulo.add(retangulo);

			} else if (opcaoForma == 3) {
				System.out.println("Digite o valor do raio do círculo:");
				try {
					raio = ler.nextDouble();
					}catch(InputMismatchException e) {
						System.out.printf("Insira um numero!");
					}
				Circulo circulo = new Circulo(raio);
				circulo.calculoPerimetro();
				circulo.calculoArea();

				listaCirculo.add(circulo);
			}
		

		for (Quadrado q : listaQuadrado) {
			System.out.printf("---Quadrados---\n" + "Dados fornecidos: lado = %.2f\n" + "Perímetro: %.2f\n" + "Área: %.2f",
					q.getLado(), q.calculoPerimetro(), q.calculoArea());
		}
		for (Retangulo r : listaRetangulo) {
			System.out.printf("\n---Retângulos---\n" + "Dados fornecidos: lado = %.2f , base = %.2f\n" + "Perímetro: %.2f\n" + "Área: %.2f",
					r.getLado(),r.getBase(), r.calculoPerimetro(), r.calculoArea());
		}
		for (Circulo c : listaCirculo) {
			System.out.printf("\n---Círculos---\n" + "Dados fornecidos: raio = %.2f\n" + "Perímetro: %.2f\n" + "Área: %.2f",
					c.getRaio(), c.calculoPerimetro(), c.calculoArea());
		}
		ler.close();
	}
}