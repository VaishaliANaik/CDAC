
public class Complex {
	int real;
	int imag;
	
	public void sum(Complex c1, Complex c2) {
		int real = c1.real + c2.real;
		int imag = c1.imag + c2.imag;
		System.out.println(real + " + " + imag + "i");
		
	}
	
	public void difference(Complex c1, Complex c2) {
		int real = c1.real - c2.real;
		int imag = c1.imag - c2.imag;
		System.out.println(real + " - " + imag + "i");
	}
	
	public void product(Complex c1, Complex c2) {
		int real = (c1.real * c2.real) - (c1.imag * c2.imag);
		int imag = (c1.real * c2.imag) + (c1.imag * c2.real);
		System.out.println(real + " * " + imag + "i");
	}
}
