import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data3 {

	public static void main(String[] args) {
		
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data Atual : " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("Dia da Semana: " + localDate.getDayOfWeek());
		
		System.out.println("Mes: " + localDate.getMonth());
		
		System.out.println("Dia do Mes: " + localDate.getDayOfMonth());
		
		System.out.println("Dia do Ano: " + localDate.getDayOfYear());
		
		System.out.println("Ano: " + localDate.getYear());
	}

}
