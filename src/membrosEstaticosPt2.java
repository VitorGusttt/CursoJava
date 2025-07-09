import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class membrosEstaticosPt2 {
	
	public static void main(String[] args) {
		//irei fazer 3 jeitos, fazendo uma classe Calc e instanciando ela
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		System.out.print("Raio: ");
		double raio = sc.nextDouble();
		double circuferencia = calc.circuferencia(raio);
		double volume = calc.volume(raio);
		
		System.out.printf("Circunferencia: %.2f %n", circuferencia);
		System.out.printf("Volume: %.2f %n", volume);
		System.out.printf("Pi: %.2f %n", calc.PI);
	}

}
