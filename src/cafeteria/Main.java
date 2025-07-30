package cafeteria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Escolha uma opção de café: ");
		System.out.println("1- Pequeno 150 Ml = R$:5,00 ");
		System.out.println("2- Médio 300 Ml = R$:7,50 ");
		System.out.println("3- Grande 500 Ml = R$:10,00 ");
		
		int escolha = scanner.nextInt();
		Cafe cafeSelecionado = null;
		
		switch (escolha) {
		case 1: cafeSelecionado = Cafe.PEQUENO;break;
		case 2: cafeSelecionado = Cafe.MEDIO;break;
		case 3: cafeSelecionado = Cafe.GRANDE;break;
		default: System.out.println("Houve algum erro amigo");
		}
		
		System.out.println("Tamanho: " + cafeSelecionado);	
		System.out.println("Quantidade: " + cafeSelecionado.getMl() + "Ml");
		System.out.println("Preço: " + cafeSelecionado.getPreco());
		
		scanner.close();
	}
}
