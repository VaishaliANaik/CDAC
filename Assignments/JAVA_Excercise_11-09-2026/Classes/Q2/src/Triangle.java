public class Triangle {
	float side1;
	float side2;
	float side3;

	Triangle(int s1, int s2, int s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	
	public void area() {
		float area = ((0.5f) * side2 * side3);
		System.out.println("Area : " + area);
	}
	
	public void perimeter() {
		float perimeter = side1 + side2 + side3;
		System.out.println("Perimeter : " + perimeter);
	}
	
	 
}
