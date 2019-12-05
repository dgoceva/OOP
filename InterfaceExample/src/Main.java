import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(2,3,4);
		Triangle t2 = new Triangle(4,3,2);
		Square s1 = new Square(4);
		Square s2 = new Square(5);
		ArrayList<Figure> figures = new ArrayList<Figure>();
		figures.add(t1);
		figures.add(t2);
		figures.add(s1);
		figures.add(s2);
		figures.add(new Rectangle(3,4));
		figures.add(new Rectangle(2,8));
		
		System.out.println(t1.area());
		System.out.println(t1.isEqual(t2));
		System.out.println(t1.isEqual(s2));
		System.out.println(s1.isEqual(s2));
		System.out.println(s1.isEqual(figures.get(5)));
		
		for(Figure f: figures) {
			System.out.println(f.area());
		}
	}

}
