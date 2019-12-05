
public class Rectangle extends Figure {

	private double a,b;
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean isEqual(IEqual figure) {
		// TODO Auto-generated method stub
		if(figure instanceof Rectangle) {
			return area()==((Rectangle)figure).area();
		}
		return false;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return a*b;
	}

}
