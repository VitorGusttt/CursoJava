import java.util.Scanner;

public class aulaMatrizes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];//matrizes
		int negativos = 0;
		for (int i =0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < 0) {
					negativos++;
				};
			};
		};
		
		System.out.print("Diagonal pricipal: ");
		for (int i = 0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		System.out.print("Quantidade de negativos: " + negativos);
		sc.close();
	}
}
