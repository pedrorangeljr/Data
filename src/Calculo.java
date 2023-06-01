import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calculo {

	public static void main(String[] args)throws Exception {

	  Calendar calendar = Calendar.getInstance();
	  
	  /*Simular que data do banco de dados*/
	  
	  calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2023")); // Define um data qualquer
	  
	  calendar.add(Calendar.DAY_OF_MONTH, 5);
	  
	  System.out.println("Somando dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	  
	  calendar.add(Calendar.MONTH, 1);
	  
	  System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	  
	  calendar.add(Calendar.YEAR, 1);
	  
	  System.out.println("Somando 1 ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
	
	

}
