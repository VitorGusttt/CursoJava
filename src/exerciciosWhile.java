import java.util.Scanner;

public class exerciciosWhile {

	public static void main(String[] args) {

		// exercicio 1
		Scanner sc = new Scanner(System.in);
		int senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = sc.nextInt();
		}
		;
		System.out.println("Acesso permitido");

		// exercicio2
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}

			x = sc.nextInt();
			y = sc.nextInt();
		}
		;

		System.out.println("acabou");

		// exewrcicio 3
		int cod, alcool, gasolina, diesel;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		cod = sc.nextInt();

		while (cod != 4) {
			switch (cod) {
			case 1:
				alcool += 1;
				cod = sc.nextInt();
				break;
			case 2:
				gasolina += 1;
				cod = sc.nextInt();
				break;
			case 3:
				diesel += 1;
				cod = sc.nextInt();
				break;
			default:
				cod = sc.nextInt();
				break;
			};
		};
		System.out.println("Obrigado");
		System.out.printf("Alcool: %d %nGasolina: %d %nDiesel %d %n", alcool, gasolina, diesel);

	}

}
