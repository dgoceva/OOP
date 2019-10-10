import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempList.input("D:\\OOP\\repository\\TempExample\\Temperature.txt");
		TempList.print();
		System.out.println("Average T= "+TempList.average());
		MutableFloat temp=new MutableFloat();
		MutableInteger day=new MutableInteger();
		TempList.max(temp, day);
		System.out.println(day.getData()+", "+temp.getData());

		int dayIndex = TempList.maxTemp();
		System.out.println("Max T="+TempList.getTemp(dayIndex)+
				", day="+dayIndex);
		System.out.println(TempList.maxTemperature());
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(reverse(line));
		
		System.out.println(reverse("hello"));
	}
	
	static String reverse(String str) {
		StringBuilder val = new StringBuilder(str);
		val.reverse();
		return val.toString();
	}

}
