package luiz.udemy.programa7;

import java.util.Locale;
import java.util.Scanner;

public class SetimoPrograma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int NumeroFuncionario, HorasTrabalhadas;
		double ValorHora, SalarioFuncionario;
		
		System.out.println("Digite o Numero do Funcionario: ");
		NumeroFuncionario = sc.nextInt();
		
		System.out.println("Digite as Horas Trabalhadas: ");
		HorasTrabalhadas = sc.nextInt();
		
		System.out.println("Digite o Valor Hora: ");
		ValorHora = sc.nextDouble();
		
		SalarioFuncionario = HorasTrabalhadas * ValorHora;
		
		System.out.println("NUMBER= " + NumeroFuncionario);
		System.out.printf("SALARY= U$ %.2f%n", SalarioFuncionario);
		
		sc.close();
	}

}
