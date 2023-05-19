import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompararDatas {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("15/04/2023");
		
		Date dataAtualHoje = simpleDateFormat.parse("11/04/2023");
		
		if(dataVencimentoBoleto.after(dataAtualHoje)) { // usar o after para saber se a data 1 é maior que a data 2
			
			System.out.println("Boleto não vencido");
		}
		else {
			
			System.out.println("Boleto Vencido - Urgente");
		}

	}

}
