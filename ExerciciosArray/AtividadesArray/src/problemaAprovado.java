import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //leia x nomes e idades e diga quem é o mais velho

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos Alunos vai ler: ");
        int x = sc.nextInt();
        String[] vetorNome = new String[x];
        double[] vetorNota1 = new double[x];
        double[] vetorNota2 = new double[x];
        double[] vetorMedia = new double[x];
        for (int i = 0; i < vetorNome.length ; i++){
            System.out.println("Dados da " + i + "a pessoa: ");
            System.out.print("nome: ");
            sc.nextLine();
            vetorNome[i] = sc.nextLine();
            System.out.print("Nota 1: ");
            vetorNota1[i] = sc.nextDouble();
            System.out.print("Nota 2: ");
            vetorNota2[i] = sc.nextDouble();
            vetorMedia[i] = (vetorNota1[i] + vetorNota2[i]) / 2;
        };
        
        System.out.println("Alunos acima da média: ");
        for (int i = 0; i < vetorNome.length ; i++){
            if (vetorMedia[i] > 6.0){
                System.out.println(vetorNome[i]);
            }
        };
    }
}