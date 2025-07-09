package util;

public class Calculadora {
	
	public final double PI = 3.14159;
	
	public double circuferencia(double raio){
		return 2 * PI * raio;
	};
	public double volume(double raio){
		return (4 * PI * Math.pow(raio, 3))/3;
	};

}
