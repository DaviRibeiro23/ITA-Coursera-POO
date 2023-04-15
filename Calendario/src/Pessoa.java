
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private Date dataDeNascimento;

	public Pessoa(String ddn) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.dataDeNascimento = sdf.parse(ddn);
	}

	protected String getSigno() throws ParseException {
		String signo = null;
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataDeNascimento);

		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		if (day >= 22 && month == 12 || day <= 20 && month == 1) {
			signo = "Capric�rnio";
		} else if (day >= 21 && month == 1 || day <= 19 && month == 2) {
			signo = "Aqu�rio";
		} else if (day >= 20 && month == 2 || day <= 20 && month == 3) {
			signo = "Peixes";
		} else if (day >= 21 && month == 3 || day <= 20 && month == 4) {
			signo = "�ries";
		} else if (day >= 21 && month == 4 || day <= 20 && month == 5) {
			signo = "Touro";
		} else if (day >= 21 && month == 5 || day <= 20 && month == 6) {
			signo = "G�meos";
		} else if (day >= 21 && month == 6 || day <= 21 && month == 7) {
			signo = "C�ncer";
		} else if (day >= 22 && month == 7 || day <= 22 && month == 8) {
			signo = "Le�o";
		} else if (day >= 23 && month == 8 || day <= 22 && month == 9) {
			signo = "Virgem";
		} else if (day >= 23 && month == 9 || day <= 22 && month == 10) {
			signo = "Libra";
		} else if (day >= 23 && month == 10 || day <= 21 && month == 11) {
			signo = "Escorpi�o";
		} else if (day >= 22 && month == 11 || day <= 21 && month == 12) {
			signo = "Sagit�rio";
		}

		return signo;
	}

	protected int getIdade() throws ParseException {

		int age = 0;
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataDeNascimento);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);

		LocalDate ld = LocalDate.of(year, month, date);

		Relogio agora = new Relogio("15/03/2023"); // RELOGIO DATA FIXA PARA TESTES
		// Relogio agora = new Relogio(); // RELOGIO DATA ATUAL

		Period diff = Period.between(ld, agora.agora());

		age = diff.getYears();

		return age;
	}
}

//@Override
//public String toString() {
//	return this.age + " anos";
//}