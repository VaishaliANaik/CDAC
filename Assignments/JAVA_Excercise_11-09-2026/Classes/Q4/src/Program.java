
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complex c1 = new Complex();
		
		System.out.println("Complex Number 1 : ");
		
		System.out.println("Real : ");
		c1.real = ConsoleInput.getInt();
		
		System.out.println("Imag : ");
		c1.imag = ConsoleInput.getInt();
		
		Complex c2 = new Complex();
		
		System.out.println("Complex Number 2 : ");
		
		System.out.println("Real : ");
		c2.real = ConsoleInput.getInt();
		
		System.out.println("Imag : ");
		c2.imag = ConsoleInput.getInt();
		
		Complex c = new Complex();
		
		System.out.println("Sum : ");
		c.sum(c1, c2);
		
		System.out.println("Difference : ");
		c.difference(c1, c2);
		
		System.out.println("Product : ");
		c.product(c1, c2);
		
		
	}

}
