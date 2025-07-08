public class funcoesString {

	public static void main(String[] args) {
		String texto = "  Vitor gustavooo92 SOARES Fre1t4as *^&*$     ";
		String t1 = texto.toLowerCase(); //trans em minusculas
		String t2 = texto.toUpperCase(); //trans em maiusculas
		String t3 = texto.trim(); //tira espacos nos cantos
		String t4 = texto.substring(20); //comeca a stringa partir do indice 20
		String t5 = texto.substring(20, 24); //comeca a stringa partir do indice 20 ate a 24
		String t6 = texto.replace('v', 'c'); //trocar v por c (case sensitive)
		String t7 = texto.replace("Vitor", "Cleber"); //trocar Vitor por Cleber (case sensitive)
		int t8 = texto.indexOf("92"); //acha o 1 index da string 92
		int t9 = texto.lastIndexOf("a"); //acha o ultimo index da string a
		String[] vector = texto.split(" "); //separa a string em um vetor com base no argumento
		
		System.out.println("Original: -" + texto + "-");
		System.out.println("toLowerCase: -" + t1 + "-");
		System.out.println("toUpperCase: -" + t2 + "-");
		System.out.println("trim: -" + t3 + "-");
		System.out.println("substring: -" + t4 + "-");
		System.out.println("substring: -" + t5 + "-");
		System.out.println("replace: -" + t6 + "-");
		System.out.println("replace: -" + t7 + "-");
		System.out.println("indexOf: -" + t8 + "-");
		System.out.println("indexOf: -" + t9 + "-");
		System.out.println("split: -" + vector[0] + "-" + vector[1] + vector[2] + "-" + vector[3] + vector[4] + "-" + vector[5]);
	}

}
