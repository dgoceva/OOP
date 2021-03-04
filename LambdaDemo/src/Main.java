
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation addition = (a,b) -> a+b;
		MathOperation subtraciton = (int a, int b) -> a-b;
		MathOperation multiplication = (a,b) -> {return a*b;};
		MathOperation division = (int a, int b) -> a/b;
		
		System.out.println("10 + 5 = "+operate(10, 5,addition));
		System.out.println("10 - 5 = "+operate(10, 5,subtraciton));
		System.out.println("10 * 5 = "+operate(10, 5,multiplication));
		System.out.println("10 / 5 = "+operate(10, 5,division));
	}
	private static int operate(int a, int b, MathOperation operation) {
		return operation.operation(a, b);
	}
	@FunctionalInterface
	interface MathOperation{
		int operation(int a, int b);
	}
}

