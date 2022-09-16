package ex12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> listaProdutos = new ArrayList<>();
		System.out.printf("\nOlá, irei anotar seus pedidos!");
		
		String produto, preco, produtoFinal, path,quantidade;
		
		path = "C:\\Users\\Luiz\\Desktop\\CP-JAVA-2°Semestre\\ex12\\listaDeCompras.txt";
		
		for(int i=1; i<11; i++) {
			System.out.printf("\nProduto %d:",i);
			System.out.printf("\nQual o nome do produto?");
			produto=ler.next();
			System.out.printf("Qual a quantidade de produtos?");
			quantidade=ler.next();
			System.out.printf("\nQual o preço do produto?");
			preco=ler.next();
			
			produtoFinal = produto+','+quantidade+','+preco;
			
			listaProdutos.add(produtoFinal);
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for(String line: listaProdutos) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }

	}

}
