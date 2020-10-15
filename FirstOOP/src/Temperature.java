import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Temperature implements Comparable<Temperature> {
	private double temp;
	private GregorianCalendar date;

	public Temperature() {

	}

	public Temperature(double temp, int day, int month, int year) {
		date = new GregorianCalendar(year, month - 1, day);
		this.temp = temp;
	}

	public Temperature(double temp, GregorianCalendar date) {
		this.date = date;
		this.temp = temp;
	}

	public Temperature(Temperature data) {
		this.date = data.date;
		this.temp = data.temp;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		if (temp >= -20 && temp <= 40) {
			this.temp = temp;
		}
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return dateToStr() + ", " + temp;
	}

	public String dateToStr() {
		SimpleDateFormat temp = new SimpleDateFormat("dd.MM.yyyy");
		return temp.format(date.getTime());
	}

	@Override
	public int compareTo(Temperature o) {
		// TODO Auto-generated method stub
		if (temp < o.temp) {
			return -1;
		} else if (temp == o.temp) {
			return 0;
		} else {
			return 1;
		}
	}
}
