
public class Practice {

	public void oddNumber() {
		for(int itemp = 1; itemp <= 1000; itemp++) {
			if(itemp % 2 != 0) {
				System.out.println(itemp + " ");
			}
		}
	}
	
	public void evenNumber() {
		for(int itemp = 1; itemp <= 500; itemp++) {
			if(itemp % 2 == 0) {
				System.out.println(itemp + " ");
			}
		}
	}
	
	public void seventhNumber() {
		for(int itemp = 1; itemp <= 200; itemp++) {
			if(itemp % 7 == 0) {
				System.out.println(itemp + " ");
			}
		}
	}
	
	public void pattern1() {
		for(int rows= 1; rows<= 5; rows++) {
			for(int cols= 1; cols<= rows; cols++) {
				System.out.print("*");
			}
		System.out.println("");
		}
	}
	
	public void pattern2() {
		for(int rows= 5; rows>= 1; rows--) {
			for(int cols= 1; cols<= rows; cols++) {
				System.out.print("*");
			}
		System.out.println("");
		}
	}

	
	public void pattern3() {
		int n = 1;
		for(int rows= 1; rows<= 4; rows++) {
			for(int cols= 1; cols<= rows; cols++) {
				System.out.print(n + " ");
				n++;
			}
		System.out.println("");
		}
	}
	
	public void pattern4() {
		for(int rows= 1; rows<= 6; rows++) {
			for(int cols= 1; cols<= rows; cols++) {
				System.out.print(cols);
			}
		System.out.println("");
		}
	}
	
	public void pattern5() {
		for(int rows= 6; rows>= 1; rows--) {
			for(int cols= 1; cols<= rows; cols++) {
				System.out.print(cols);
			}
		System.out.println("");
		}
	}
	
	
	
	
}
