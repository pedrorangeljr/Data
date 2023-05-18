import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Calendar2 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		//Date date = new Date();
		
		System.out.println("Calendar Data Atual: " + simpleDateFormat.format(calendar.getInstance().getTime()));
		
		System.out.println("Calendar Dia do Mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Calendar dia da Semana: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Calendar Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Calendar Minuto da Hora: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Calendar Segundos da hora: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Calendar Ano: " + calendar.get(calendar.YEAR));
		
		

	}

}
