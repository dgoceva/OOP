import java.util.ArrayList;
import java.util.Scanner;

public class TempList {

	private static ArrayList temp = new ArrayList();
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("T["+(i+1)+"]= ");
			temp.add(sc.nextFloat());
		}
	}

	static void print() {
		System.out.print("[ ");
		for(int i=0;i<temp.size();i++) {
			System.out.print(temp.get(i)+" ");
		}
		System.out.println("]");
	}
	
	static float average() {
		float sum=0;
		for(int i=0;i<temp.size();i++) {
			sum += (float)temp.get(i);
		}
		return sum/temp.size();
	}
}

