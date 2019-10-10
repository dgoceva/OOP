
public class Temperature {
	private float temp;
	private int day;
	
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Temperature [temp=" + temp + ", day=" + day + "]";
	}
	
	
}
