package luiz.udemy.programa8;

import java.util.Locale;
import java.util.Scanner;

public class OitavoPrograma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco2, total;
		double preco1;
		
		System.out.println("Entre com código da Peça 1: ");
		cod1 = sc.nextInt();
		
		System.out.println("Entre com o número de Peça 1: ");
		qtd1 = sc.nextInt();
		
		System.out.println("Entre com o preço 1: ");
		preco1 = sc.nextDouble();
		
		System.out.println("Entre com código da Peça 2: ");
		cod2 = sc.nextInt();
		
		System.out.println("Entre com o número de Peça 2: ");
		qtd2 = sc.nextInt();
		
		System.out.println("Entre com o preço 2: ");
		preco2 = sc.nextDouble();
		
		total = (qtd1*preco1) + (qtd2*preco2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
