
public class Employee {
	double salary;
	float no_of_hrs;

	public void getInfo(double s, float h) {
		salary = s;
		no_of_hrs = h;
	}
	
	public void addSal() {
		if(salary <= 500) {
			salary += 10;
		}
		System.out.println(salary);
	}
	
	public void addWork() {
		if(no_of_hrs > 6) {
			salary += 5;
		}
		System.out.println(salary);
	}
}

