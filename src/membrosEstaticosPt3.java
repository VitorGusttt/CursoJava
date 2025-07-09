import java.util.Locale;
import java.util.Scanner;

import util.Calculadora2;

public class membrosEstaticosPt3 {
	
	public static void main(String[] args) {
		//irei fazer 3 jeitos, classe Calc estatica
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Raio: ");
		double raio = sc.nextDouble();
		double circuferencia = Calculadora2.circuferencia(raio);
		double volume = Calculadora2.volume(raio);
		
		System.out.printf("Circunferencia: %.2f %n", circuferencia);
		System.out.printf("Volume: %.2f %n", volume);
		System.out.printf("Pi: %.2f %n", Calculadora2.PI);
	}

}
