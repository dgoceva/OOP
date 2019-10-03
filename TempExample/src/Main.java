import java.util.Scanner;

public class Main {

	private static float[] temp;
	private static final int LEN=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		temp = new float[LEN];
//		input();
//		inputRandom();
//		print();
//		System.out.println("Average T= "+average());
		TempList.input();
		TempList.print();
		System.out.println("Average T= "+TempList.average());
//		Float temp=new Float(0);
//		Integer day=new Integer(-1);
//		TempList.max(temp, day);
//		System.out.println("Max T="+temp.floatValue()+
//				", day="+day.intValue());

		int dayIndex = TempList.maxTemp();
		System.out.println("Max T="+TempList.getTemp(dayIndex)+
				", day="+dayIndex);
		
	}
/*
	private static void input() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<temp.length;i++) {
			System.out.print("T["+(i+1)+"]= ");
			temp[i] = sc.nextFloat();
		}
	}
	
	private static void inputRandom() {
		for(int i=0;i<temp.length;i++) {
			double t = 20 - Math.random() * 35;
			System.out.print(t+" ");
			temp[i] = roundToOne(t);
		}
		System.out.println();
	}
	
	private static float roundToOne(double d) {
		return (float)(Math.round(d*10)/10.0);
//		return (float)(((long) 
//				(d < 0 ? d * 10 - 0.5 : d * 10 + 0.5)) / 10.0);
	}
	private static void print() {
		System.out.print("[ ");
		for(float t : temp) {
			System.out.print(t+" ");
		}
		System.out.println("]");
	}
	
	private static float average() {
		float sum=0;
		for(int i=0;i<temp.length;i++) {
			sum += temp[i];
		}
		return roundToOne(sum/temp.length);
	}
*/
}
