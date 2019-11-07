import java.util.Scanner;

public class Cars {
	private Car[] cars;

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	public Cars(Car[] cars) {
		super();
		this.cars = cars;
	}
	
	public Cars(int len) {
		super();
		cars = new Car[len];
	}
	public Cars() {
		
	}
	
	public void inputCars() {
		Scanner sc = new Scanner(System.in);

		for (int i=0;i<cars.length;++i) {
			cars[i] = new Car();
			System.out.print("Input Model: ");
			cars[i].setModel(sc.nextLine());
			System.out.print("Input Year: ");
			cars[i].setYear(sc.nextShort());
			System.out.print("Input Serial Number: ");
			cars[i].setsNumber(sc.nextInt());
			sc.nextLine();
		}

	}

	public void outputCars() {
		// TODO Auto-generated method stub
		for(Car car : cars) {
			System.out.println(car);
		}
	}
}
