import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 numeros");
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("Maior : " + max(a,b,c));
	}
	
	public static int max(int x, int y, int z) {
			int maior = 0;
			
			if (x > y && x > z) {
				maior = x;
			}
			else if(y > z) {
				maior = y;
			}
			else {
				maior = z;
			};
			return maior;
	};
}


