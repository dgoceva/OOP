import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempList.input("D:\\OOP\\repository\\TempExample\\Temperature.txt");
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

}
