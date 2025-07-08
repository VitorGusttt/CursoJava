import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class retanguloPrograma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret;
		ret = new Retangulo();
		
		ret.altura = sc.nextDouble();
		ret.largura = sc.nextDouble();
		
		System.out.println(ret);
		
	}

}
