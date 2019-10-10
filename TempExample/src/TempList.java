import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TempList {

	private static ArrayList<Float> temp = new ArrayList<>();
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("T["+(i+1)+"]= ");
			temp.add(sc.nextFloat());
		}
	}

	static void input(String fname) {
		try (Scanner sc = new Scanner(new File(fname))){
			while(sc.hasNextFloat()) {
				temp.add(sc.nextFloat());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			sum += temp.get(i);
		}
		return sum/temp.size();
	}
	
	static void max(MutableFloat temperature, MutableInteger day) {
		int d=0;
		
		for(int i=1;i<temp.size();i++) {
			if (temp.get(d) < temp.get(i)) {
				d = i;
			}
		}
		day.setData(d);
		temperature.setData(temp.get(d));
//		System.out.println(day.getData()+", "+temperature.getData());
	}
	
	static int maxTemp() {
		int d=0;
		for(int i=1;i<temp.size();i++) {
			if (temp.get(d) < temp.get(i)) {
				d = i;
			}
		}
		
		return d;
	}
	
	static float getTemp(int index) {
		return temp.get(index);
	}
	
	static Temperature maxTemperature() {
		int d=0;
		for(int i=1;i<temp.size();i++) {
			if (temp.get(d) < temp.get(i)) {
				d = i;
			}
		}
		
		Temperature value = new Temperature();
		value.setDay(d);
		value.setTemp(temp.get(d));
		return value;
	}

}

