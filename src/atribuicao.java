import java.util.Locale;
import java.util.Scanner;

public class atribuicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Pode ler um por vez ou todos na mesma linha
		//String x = sc.next(); //permite digita uma palavra
		//sint y = sc.nextInt(); //permite digita um numero
		//sdouble z = sc.nextDouble(); //permite digita um numero
		//char w = sc.next().charAt(0); //permite digita um char
		//System.out.println("Voce digitou: " + x +" " + y + " " + z + " " + w);

		
		String s1, s2, s3;
		 s1 = sc.nextLine();
		 s2 = sc.nextLine();
		 s3 = sc.nextLine();
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 
		 sc.close();
		 
	}

}
