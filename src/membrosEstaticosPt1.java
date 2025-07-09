import java.util.Locale;
import java.util.Scanner;

public class membrosEstaticosPt1 {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		//irei fazer 3 jeitos, metodos na propria classe
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Raio: ");
		double raio = sc.nextDouble();
		double circuferencia = circuferencia(raio);
		double volume = volume(raio);
		
		System.out.printf("Circunferencia: %.2f %n", circuferencia);
		System.out.printf("Volume: %.2f %n", volume);
		System.out.printf("Pi: %.2f %n", PI);
	}
	
	public static double circuferencia(double raio){
		return 2 * PI * raio;
	};
	public static double volume(double raio){
		return (4 * PI * Math.pow(raio, 3))/3;
	};

}
