import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data5 {

	public static void main(String[] args) {

		
		  LocalDate inicio = LocalDate.of(2023, 2, 9); 
		  LocalDate finalData = LocalDate.of(2023, 2, 20);
		  
		  long dias = ChronoUnit.DAYS.between(inicio, finalData);
		  
		  System.out.println(dias);
		
		
		

	}

}
