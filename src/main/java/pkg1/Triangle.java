package pkg1;

public class Triangle extends GeometricObject{

	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	public Triangle() {
		this.setSide1(1);
		this.setSide2(1);
		this.setSide3(1);
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3){
		super();
		this.setSide1(side1);
		this.setSide2(side2);
		this.setSide3(side3);
	}

	@Override
	public double getArea() throws Exception {
		double s = this.getPerimeter() / 2;
		double arg = s * (s - side1) * (s - side2) * (s - side3);
		if (arg >= 0){
			throw new TriangleException("This triangle does not exist");
		}
		else{
			return Math.sqrt(arg);
		}
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public String toString() {
		String str = "The side lengths of the triangle are s" + side1 + ", " + side2 + " and " + side3
				+ ". The area is " + this.getArea() + " and the perimeter is " + this.getPerimeter() + ".";
		return str;
	}
}
