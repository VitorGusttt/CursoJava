import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //leia x nomes e idades e diga quem é o mais velho

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas vai ler: ");
        int x = sc.nextInt();
        String[] vetorNome = new String[x];
        int[] vetorIdade = new int[x];
        String maisVelho = ""; int maisVelhoIdade = 0;
        for (int i = 0; i < vetorIdade.length ; i++){
            System.out.println("Dados da " + i + "a pessoa: ");
            System.out.print("nome: ");
            sc.nextLine();
            vetorNome[i] = sc.nextLine();
            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();
            
            if (vetorIdade[i] > maisVelhoIdade) {
              maisVelho = vetorNome[i];
              maisVelhoIdade = vetorIdade[i];
            };
            
            System.out.println("Pessoa mais velha: " + maisVelho);
        };
    }
}