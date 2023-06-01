import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class FaixaTempo {

	public static void main(String[] args) throws ParseException {
		
		
		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");

		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2023-05-01"), LocalDate.now());
		
		System.out.println(dias);
	}

}
