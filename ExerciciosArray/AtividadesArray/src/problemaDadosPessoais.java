import java.util.Scanner;
class problemaDadosPessoais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas vai ler: ");
        int x = sc.nextInt();
        String[] vetorSexo = new String[x];
        double[] vetorAltura = new double[x];
        int mulheres =0; int homens = 0; double mediaMulheres = 0;
        double somaAlturasMulheres = 0;
        double maiorAltura = 0; double menorAltura = 100;
        for (int i = 0; i < vetorSexo.length ; i++){
            System.out.println("Dados da " + i + "a pessoa: ");
            System.out.print("Sexo: ");
            sc.nextLine();
             vetorSexo[i] = sc.next().trim().toUpperCase();
            System.out.print("Altura : ");
            vetorAltura[i] = sc.nextDouble();
             if (vetorSexo[i].equals("F")) { 
                somaAlturasMulheres += vetorAltura[i];
                mulheres++;
            } else if (vetorSexo[i].equals("M")) {
                homens++;
            } else {
                System.out.println("Sexo inválido. Contando como masculino por padrão.");
            }

        };
        
        for (int i = 0; i < vetorSexo.length ; i++){
          if (vetorAltura[i] > maiorAltura){
              maiorAltura = vetorAltura[i];
          };
          
          if (vetorAltura[i] < menorAltura){
              menorAltura = vetorAltura[i];
          };
        };
        
       mediaMulheres = (mulheres > 0) ? (somaAlturasMulheres / mulheres) : 0;
        
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Media mulheres altura: " + mediaMulheres);
        System.out.println("Quantidade homens: " + homens);
    }
};