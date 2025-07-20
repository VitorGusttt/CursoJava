import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class instanciandoDatasHoras {

	public static void main(String[] args) {
		//instanciando a partir do AGORA
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formatar a partir de um padrao
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //formatar a partir de um padrao
		LocalDate d1 = LocalDate.now(); // data local
		LocalDateTime d2 = LocalDateTime.now(); //Data e hora local
		Instant d3 = Instant.now(); //instante
		LocalDate d4 = LocalDate.parse("2006-08-26"); // criar data a partir de uma string
		LocalDateTime d5 = LocalDateTime.parse("2006-08-26T18:30:55"); // criar data a partir de uma string
		Instant d6 = Instant.parse("2006-08-26T18:30:55Z"); // criar data a partir de uma string
		Instant d7 = Instant.parse("2006-08-26T18:30:55-03:00");
		LocalDate d8 = LocalDate.parse("26/08/2006", f1);
		LocalDateTime d9 = LocalDateTime.parse("26/08/2006 01:20", f2);
		LocalDate d10 = LocalDate.of(2006, 8, 26);
		LocalDateTime d11 = LocalDateTime.of(2006, 8, 26, 19, 20);
		
		
		System.out.println("d1: "+ d1); // Local
		System.out.println("------------------------------------------");
		System.out.println("d2: "+ d2); //Local com horas
		System.out.println("------------------------------------------");
		System.out.println("d3: "+ d3);	//Data hora com padrao GMT
		System.out.println("------------------------------------------");
		System.out.println("d4: "+ d4);	//Data a partir de uma String
		System.out.println("------------------------------------------");
		System.out.println("d5: "+ d5);	//Data a partir de uma String
		System.out.println("------------------------------------------");
		System.out.println("d6: "+ d6);	//Data a partir de uma String e fuso 
		System.out.println("------------------------------------------");
		System.out.println("d7: "+ d7);	//Data a partir de uma String e fuso 
		System.out.println("------------------------------------------");
		System.out.println("d8: "+ d8);	//Data a partir de uma String e  
		System.out.println("------------------------------------------");
		System.out.println("d9: "+ d9);	//Data a partir de uma String e  
		System.out.println("------------------------------------------");
		System.out.println("d10: "+ d10);	//Data a partir de uma String e
		System.out.println("------------------------------------------");
		System.out.println("d11: "+ d11);	//Data a partir de uma String e
		System.out.println("------------------------------------------");
	}

}
