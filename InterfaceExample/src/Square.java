
public class Square extends Figure {

	private double a;
	
	public Square(double a) {
		super();
		this.a = a;
	}
	@Override
	public double area() {
		return a*a;
	}
	@Override
	public boolean isEqual(IEqual figure) {
		// TODO Auto-generated method stub
		if(figure instanceof Square) {
			Square s = (Square)figure;
			return area()==s.area();
		}
		return false;
	}

}
