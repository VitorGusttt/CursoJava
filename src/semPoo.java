import java.util.Scanner;

public class semPoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,a2,b2,c2, area, area2, p;

		System.out.println("Digite medidas do triangulo");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c= sc.nextDouble();
		p = (a + b + c) / 2;
		area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		
		System.out.println("Digite medidas do outro");
		a2 = sc.nextDouble();
		b2 = sc.nextDouble();
		c2 = sc.nextDouble();
		p = (a2 + b2 + c2) / 2;
		area2 = Math.sqrt(p * (p-a2) * (p-b2) * (p-c2));
		
		System.out.printf("Area T1: %.2f %n", area);
		System.out.printf("Area T1: %.2f %n", area2);
		
		String maior = (area > area2) ? "primeiro" : "segundo";
		
		System.out.println("Maior triangulo: " + maior);
	}

}
