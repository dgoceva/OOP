import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		iteratorSample();
		iterableSample();
	}
	
	public static void print(ArrayList<Integer> data) {
		System.out.print("( ");
		for(int x:data) {
			System.out.print(x+" ");
		}
		System.out.println(")");		
	}
	
	public static void iteratorSample() {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(new Integer(5));
		data.add(new Integer(-15));
		data.add(new Integer(21));
		data.add(new Integer(33));
		data.add(new Integer(-45));
		
		print(data);

		for(int i=0;i<data.size();++i) {
			if (data.get(i)<0) {
				data.remove(i);
			}
		}
		print(data);
		
		Iterator<Integer> it = data.iterator();
		while(it.hasNext()) {
			int x = it.next();
			if (x<0) {
				it.remove();
			}
		}
		
		print(data);
	}
	
	public static void iterableSample() {
		Array<String> data = new Array<>(new String[] {
			"One","Two","Three"	
		});
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
