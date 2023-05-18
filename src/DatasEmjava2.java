import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmjava2 {

	public static void main(String[] args) throws ParseException {
		
		/*Simple Date Formt*/
		
		Date date = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Data Atual: " + simpleDateFormat.format(date));
		
		System.out.println(simpleDateFormat.parse("11/01/1986"));

	}

}
