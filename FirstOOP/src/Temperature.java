import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Temperature {
	private double temp;
	private GregorianCalendar date;
	
	public Temperature() {
		
	}
	public Temperature(double temp,int day, int month, int year) {
		date = new GregorianCalendar(year,month-1,day);
		this.temp=temp;
	}
	
	public Temperature(double temp,GregorianCalendar date) {
		this.date = date;
		this.temp=temp;
	}
	
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		if (temp>=-20 && temp<=40) {
			this.temp=temp;
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
		return dateToStr()  + ", " + temp ;
	}
	
	public String dateToStr() {
		SimpleDateFormat temp = new SimpleDateFormat("dd.MM.yyyy");
		return temp.format(date.getTime());
	}
}
