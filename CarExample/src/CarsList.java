import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarsList {
	private List<Car> cars = new ArrayList();
	
	public void inputCars() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			Car car = new Car();
			System.out.print("Input Model: ");
			car.setModel(sc.nextLine());
			if (car.getModel().equals("0"))			
				break;
			System.out.print("Input Year: ");
			car.setYear(sc.nextShort());
			System.out.print("Input Serial Number: ");
			car.setsNumber(sc.nextInt());
			cars.add(car);
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
