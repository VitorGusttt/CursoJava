import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		System.out.println("Aulas de IF e Else");
		Scanner sc = new Scanner(System.in);
		int x; 
		
		//pega o valor
		System.out.println("Que horas são: ");
		x = sc.nextInt();
		if (x < 12 && x > 5) {
			System.out.println("Bom dia");
		}
		else if (x > 12 && x < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		};
		
		sc.close();
		

	}

}
