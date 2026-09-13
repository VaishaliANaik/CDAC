
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("==========Menu Driven==========");
		
		int num;
		Date d = new Date();
		
		do {
			System.out.println("1. Set Date		");
			System.out.println("2. Add Days		");
			System.out.println("3.Add Months	");
			System.out.println("4. Add Years	");
			System.out.println("5. Display		");
			System.out.println("6.Compare Dates	");
			System.out.println("7.Exit			");
			
			System.out.println("Enter ur choice : ");
			num = ConsoleInput.getInt();
			
			switch(num) {
			
			case 1:{
				System.out.println("Enter day : ");
				int day = ConsoleInput.getInt();
				
				System.out.println("Enter month : ");
				int month = ConsoleInput.getInt();
				
				System.out.println("Enter year : ");
				int year = ConsoleInput.getInt();
				d.setDate(day, month, year);		
				break;
				}
			
			case 2:{
				System.out.println("Enter Number of days to add : ");
				int no_of_days = ConsoleInput.getInt();
				d.addDay(no_of_days);		
				break;
				}
			
			case 3:{
				System.out.println("Enter Number of months to add : ");
				int no_of_months = ConsoleInput.getInt();
				d.addMonth(no_of_months);
				break;
			}
			case 4:{
				System.out.println("Enter Number of years to add : ");
				int no_of_years = ConsoleInput.getInt();
				d.addYear(no_of_years);
				break;
			}
			case 5:d.display();
			case 6:{
				//pass
				break;
			}
			case 7:break;
			}

		}while(num != 7);
		
	System.out.println("Thank you");
	}

}
