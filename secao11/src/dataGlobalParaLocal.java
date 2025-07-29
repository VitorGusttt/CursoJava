import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class dataGlobalParaLocal {

	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.parse("2027-07-29");
		LocalDateTime d4 = LocalDateTime.parse("2057-07-29");
		LocalDateTime d2 = LocalDateTime.parse("2025-07-29T16:06:55");
		Instant d3 = Instant.parse("2025-07-29T16:06:55Z");
		
		LocalDateTime r1 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault()); //transformo o ionstante no meu sistema 
		LocalDateTime r2 = d1.minusDays(7); //menos 7 dias do d1
		LocalDateTime r3 = d1.plusYears(7); //mais 7 anos do d1
		
		Duration r4 = Duration.between(d1, d4); //duracao
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4.toDays());
	}

}
