import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Data2 {

	public static void main(String[] args) {
		
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora Atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		LocalDateTime dataAtualAtualizada = LocalDateTime.now();
		
		System.out.println("Data e hora atual: " + dataAtualAtualizada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

	}

}
