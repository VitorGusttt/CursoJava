import java.util.Scanner;

public class problemaMatrizes {
	public static void main(String[] args) {
		
		/*Linhas e Colunas: 3 4
		10 8 15 12
		21 11 23 8
		14 5 13 19
		Item que pertence: 8
		Posição: 0, 1*/
		
		 //Linhas /N Colunas
		Scanner sc = new Scanner(System.in);
		System.out.print("Linhas e Colunas: ");
		int linhas = sc.nextInt();
		int colunas = sc.nextInt();
		int[][] matriz = new int[linhas][colunas];
		
		for(int i = 0; i<matriz.length;i++) {
			for (int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			};
		};
		
		//x que pertence
		System.out.print("Item que pertence: ");
		int item = sc.nextInt();
		
		//ver se pertence
		for(int i = 0; i<matriz.length;i++) {
			for (int j = 0; j<matriz[i].length; j++) {
				if (matriz[i][j] == item) {
					System.out.println("Posição: " + i +", " +j);
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
					
					System.out.println("-----------------------");
				}
			};
		};
		
		
		
	};
}
