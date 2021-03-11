import java.util.Arrays;

public class ArrayLambda {
	public static void array() {
		int[] numbers = {1,2,3,4,5,6};
		
		Arrays.stream(numbers).forEach(e->{System.out.println(e);});
	}
}
