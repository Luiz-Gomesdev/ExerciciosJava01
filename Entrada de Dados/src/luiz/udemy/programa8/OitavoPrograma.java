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
		
		System.out.println("Entre com c�digo da Pe�a 1: ");
		cod1 = sc.nextInt();
		
		System.out.println("Entre com o n�mero de Pe�a 1: ");
		qtd1 = sc.nextInt();
		
		System.out.println("Entre com o pre�o 1: ");
		preco1 = sc.nextDouble();
		
		System.out.println("Entre com c�digo da Pe�a 2: ");
		cod2 = sc.nextInt();
		
		System.out.println("Entre com o n�mero de Pe�a 2: ");
		qtd2 = sc.nextInt();
		
		System.out.println("Entre com o pre�o 2: ");
		preco2 = sc.nextDouble();
		
		total = (qtd1*preco1) + (qtd2*preco2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
