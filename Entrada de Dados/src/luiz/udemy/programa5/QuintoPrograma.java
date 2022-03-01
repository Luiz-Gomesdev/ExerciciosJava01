package luiz.udemy.programa5;

import java.util.Locale;
import java.util.Scanner;

public class QuintoPrograma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R;
		System.out.println("Entre o Raio: ");
		R = sc.nextDouble();
		
		double A= Math.PI*(R*R);
		
		System.out.printf("A=%.4f", A);
		
		
		sc.close();
	}

}
