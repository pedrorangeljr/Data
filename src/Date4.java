import java.time.Duration;
import java.time.Instant;

public class Date4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Instant inicio = Instant.now();
  
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nanos segundos : " + duracao.toNanos());
		
		System.out.println("Duração em segundos: " + duracao.toSeconds());
		
		System.out.println("Duração em Minutos : " + duracao.toMinutes());
		
		System.out.println("Duração em parte da Hora : " + duracao.toHoursPart());
	}

}
