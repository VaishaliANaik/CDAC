
public class Rectangle {
	float length;
	float breadth;
	
	Rectangle(float l, float b){
		length = l;
		breadth = b;
	}
	
	public void area() {
		float area = length * breadth;
		System.out.println("Area : " + area);
	}
}
