
public class Triangle extends Figure {

	private double a,b,c;
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double area(){
		double p=perimeter()/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public double perimeter() {
		return a+b+c;
	}
	@Override
	public boolean isEqual(IEqual figure) {
		// TODO Auto-generated method stub
		if(figure instanceof Triangle) {
			Triangle f = (Triangle)figure;
			return area()==f.area();
		}
		return false;
	}

}
