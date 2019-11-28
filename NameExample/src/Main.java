import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Name,Integer> data = new HashMap<>();
		Name n1 = new Name("Ivan","Ivanov","Georgiev");
		Name n2 = new Name("Ivan","Ivanov","Georgiev");
		Name n3 = new Name("Ivan","Petrov","Georgiev");
		
		data.put(n1, 1);
		data.put(n2, 2);
		data.put(n3, 3);
		
		Set<Entry<Name,Integer>> set = data.entrySet();
		Iterator<Entry<Name, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Entry<Name,Integer> d = it.next();
			System.out.println(d.getKey()+"->"+d.getValue());
		}
		
		Name n4 = new Name("Ivan","Petrov","Ivanov");
		System.out.println(data.containsKey(n4));
		
		Name n5 = new Name("Ivan","Petrov","Georgiev");
		System.out.println(data.containsKey(n5));
	}

}
