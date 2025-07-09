package util;

public class Calculadora2 {
	
	public static final double PI = 3.14159;
	
	public static double circuferencia(double raio){
		return 2 * PI * raio;
	};
	public static double volume(double raio){
		return (4 * PI * Math.pow(raio, 3))/3;
	};

}
