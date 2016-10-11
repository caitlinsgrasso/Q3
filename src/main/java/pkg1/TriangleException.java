package pkg1;

public class TriangleException extends Exception{
	double side1, side2, side3;
	public TriangleException(String message){
		super(message);
	}

}
