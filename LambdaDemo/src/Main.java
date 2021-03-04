
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation addition = (a,b) -> a+b;
		MathOperation subtraciton = (int a, int b) -> a-b;
		MathOperation multiplication = (a,b) -> {return a*b;};
		MathOperation division = (int a, int b) -> a/b;
		
		System.out.println("10 + 5 = "+addition.operation(10, 5));
		System.out.println("10 - 5 = "+subtraciton.operation(10, 5));
		System.out.println("10 * 5 = "+multiplication.operation(10, 5));
		System.out.println("10 / 5 = "+division.operation(10, 5));
	}

}

@FunctionalInterface
interface MathOperation{
	int operation(int a, int b);
}