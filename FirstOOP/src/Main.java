import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Main {

	public static final int SIZE=365;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GregorianCalendar date = new GregorianCalendar(2020,0,1);
//		System.out.println(dateToStr(date));
//		System.out.println(dateToStr(addOneDay(date)));
//		System.out.println(dateToStr(date));
//		Temperature temp = new Temperature(23.4,8,10,2020);
//		System.out.println(temp);
		Temperature[] data = initTemperatures();
		printTemperatures(data);
		}	
	public static Temperature[] initTemperatures() {
		Temperature[] data = new Temperature[SIZE];
		GregorianCalendar date = new GregorianCalendar(2020,0,1);
		Random rand = new Random(); 
		int sign = 1;
		for(int i=0;i<data.length;i++,sign*=(-1)) {
			double temp = Math.round(rand.nextDouble()*100)/10.+sign*20;
//			data[i] = new Temperature(temp,date.get(Calendar.DATE),
//					date.get(Calendar.MONTH),date.get(Calendar.YEAR));
			data[i] = new Temperature(temp,date);
			date = addOneDay(date);
		}
		return data;
	}
	public static void printTemperatures(Temperature[] data) {
		System.out.println(Arrays.toString(data));
	}
	public static String dateToStr(GregorianCalendar date) {
		SimpleDateFormat temp = new SimpleDateFormat("dd.MM.yyyy");
		return temp.format(date.getTime());
	}
	
	public static GregorianCalendar addOneDay(GregorianCalendar date) {
		GregorianCalendar temp = new GregorianCalendar(
				date.get(Calendar.YEAR),
				date.get(Calendar.MONTH),
				date.get(Calendar.DATE));
		temp.add(Calendar.DATE, 1);
		return temp;
	}
}
