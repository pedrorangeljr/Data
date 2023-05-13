import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		
		/*Trabalhos com Datas*/
		
		Date date = new Date();
		
		System.out.println("Date em Milesegundos: " +date.getTime());
		
		System.out.println("Dia do Mês: " +date.getDate());
		
		System.out.println("Dia da Semana: " +date.getDay());
		
		System.out.println("Horas do dia: " +date.getHours());
		
		System.out.println("Minutos: " +date.getMinutes());
		
		System.out.println("Segundos: " +date.getSeconds());
		
		System.out.println("Ano: " + (date.getYear() + 1900));

	}

}
