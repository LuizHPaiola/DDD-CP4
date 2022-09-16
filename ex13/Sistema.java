package ex13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> listaProdutos = new ArrayList<>();
		ArrayList<String> listaTotal = new ArrayList<>();
		
		FileReader fr = null;
		BufferedReader br = null;
		
		System.out.printf("\nOlá, irei anotar seus pedidos!");
		
		String produto, preco, produtoFinal, path, quantidade;
		int qtd;
		double precoUn, precoFin;
		
		path = "C:\\Users\\Luiz\\Desktop\\CP-JAVA-2°Semestre\\ex13\\listaDeCompras.txt";
		
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

	 try {
		 fr = new FileReader(path);
		 br = new BufferedReader(fr);
		 
		 String linha = br.readLine();
		 
		 while(linha!=null) {
			 String [] info = linha.split(",");
			 qtd = Integer.parseInt(info[1]);
			 precoUn = Integer.parseInt(info[2]);
			 precoFin = qtd*precoUn;
			 
			 produtoFinal = info[0]+','+precoFin;
			 listaTotal.add(produtoFinal);
			 
		 }

	 }catch(Exception e) {
		 System.out.printf("Erro ao ler o arquivo: "+e);
	 }finally {
		 if(br!= null) {
			 br.close();
		 }if(fr!=null) {
			 fr.close();
		 }
	 }
}
}