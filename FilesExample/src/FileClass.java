import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileClass {
	private ArrayList<String> data;
	public FileClass() {
		data = new ArrayList<>();
	}
	public FileClass(String fileName) {
		this();
		try {
			Scanner sc = new Scanner(new File(fileName),"UTF-8");
			while (sc.hasNextLine()) {
				data.add(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void exchangeRows(int x, int y) {
		if (x<1 || x>data.size()) {
			System.out.println("x is not valid row number");
			return;
		}
		if (y<1 || y>data.size()) {
			System.out.println("y is not valid row number");
			return;
		}
		int start = Math.min(x-1, y-1);
		int end = Math.max(x-1, y-1);
		String temp = data.get(start);
		data.set(start, data.get(end));
		data.set(end, temp);
	}
	public void writeToFile(String fileName) {
		try {
			FileWriter out = new FileWriter(fileName);
			out.write(toString());
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();

		for (String s: data) {
			str.append(s+"\n");
		}
		return str.toString();
	}
}
