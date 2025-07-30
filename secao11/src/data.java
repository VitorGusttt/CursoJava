import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class data {
	public static void main(String[] args) throws ParseException {
		//numero de millesegundos desde meia noite 1 de janeiro d 1970
		//simpleDateFormat define o formatae de conversao d date para string
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Date y1 = sdf1.parse("26/08/2006");
		Date y2 = sdf1.parse("26/08/2006 20:00:20");
		
		Date y3 = new Date();
		
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(y3));
		
		//manipular datas
		Calendar cal = Calendar.getInstance();
		cal.setTime(y3);
		cal.add(Calendar.HOUR_OF_DAY, 4); //aumentei 4 horas a mais na data
		y3 = cal.getTime();
		System.out.println(y3);
		
		int minutos = cal.get(Calendar.MINUTE); //pegar os minutos da que esta no cal
		System.out.println(minutos);
	}
}
