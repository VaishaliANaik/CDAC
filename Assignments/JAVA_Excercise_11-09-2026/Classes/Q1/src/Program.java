
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "John";
		s1.roll_no = 2;
		
		Student s2 = new Student();
		s2.name = "Sam";
		s2.roll_no = 4;
		s2.phone_no = "1234567809";
		s2.address = "Mumbai";
		
		Student s3 = new Student();
		s3.name = "John";
		s3.roll_no = 5;
		s3.phone_no = "9876543201";
		s3.address = "Navi Mumbai";
		
		System.out.println("==========Details of Sam==========");
		System.out.println("Roll No : " + s2.roll_no);
		System.out.println("Phone No : " + s2.phone_no);
		System.out.println("Address : " + s2.address);
		
		System.out.println("==========Details of John==========");
		System.out.println("Roll No : " + s3.roll_no);
		System.out.println("Phone No : " + s3.phone_no);
		System.out.println("Address : " + s3.address);
		
	}

}
