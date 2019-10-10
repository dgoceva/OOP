import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a: ");
		int a = sc.nextInt();
		
		System.out.print("Input b: ");
		int b = sc.nextInt();
		
		System.out.println("x= "+calcfunction(a, b));
	}

	public static float calcfunction(int a, int b) {
		return (float)-b/a;
	}
}
