import java.util.Scanner;

import entidades.Triangulo;

public class comPoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite medidas do triangulo");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c= sc.nextDouble();
		double area = x.area();
		
		System.out.println("Digite medidas do outro");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double area2 = y.area();
		System.out.printf("Area T1: %.2f %n", area);
		System.out.printf("Area T1: %.2f %n", area2);
		
		String maior = (area > area2) ? "primeiro" : "segundo";
		
		System.out.println("Maior triangulo: " + maior);
	}

}
