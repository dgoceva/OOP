
public class Car {
	private String model;
	private short year;
	private int sNumber;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public int getsNumber() {
		return sNumber;
	}
	public void setsNumber(int sNumber) {
		this.sNumber = sNumber;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", sNumber=" + sNumber + "]";
	}
	public Car(String model, short year, int sNumber) {
		super();
		this.model = model;
		this.year = year;
		this.sNumber = sNumber;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
}
